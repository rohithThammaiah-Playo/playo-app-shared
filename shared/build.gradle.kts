plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    kotlin("plugin.serialization") version "2.0.0"
    alias(libs.plugins.kmmbridge)
    alias(libs.plugins.skie)
    `maven-publish`
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            freeCompilerArgs += listOf("-Xframework-build-type=${project.findProperty("KOTLIN_FRAMEWORK_BUILD_TYPE") ?: "release"}")
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(libs.ktor.client.core)
                implementation(libs.kotlinx.serialization.json)
                implementation(libs.ktor.client.serialization.json)
                implementation(libs.ktor.client.content.negotiation)
                implementation(libs.gson)
                // implementation(Libs.Kotlin.coroutines)
            }
        }

        androidTarget {
            dependencies {
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.okhttp)
                implementation(libs.gson)
            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)

            dependencies {
                implementation(libs.ktor.client.darwin)
            }
        }
    }
}

tasks {
    val setFrameworkBuildType by creating {
        doFirst {
            val buildType = project.findProperty("KOTLIN_FRAMEWORK_BUILD_TYPE") ?: "release"
            println("KOTLIN_FRAMEWORK_BUILD_TYPE is set to $buildType")
        }
    }

    val assemble by getting {
        dependsOn(setFrameworkBuildType)
    }
}


android {
    namespace = "com.techmash.playo.shared"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

addGithubPackagesRepository()

kmmbridge {
    mavenPublishArtifacts()
    spm()
}