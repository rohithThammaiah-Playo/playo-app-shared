plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.kmmbridge).apply(false)
    alias(libs.plugins.skie).apply(false)
}

val autoVersion = project.property(
    if (project.hasProperty("AUTO_VERSION")) {
        "AUTO_VERSION"
    } else {
        "LIBRARY_VERSION"
    }
) as String

subprojects {
    val GROUP: String by project
    group = GROUP
    version = autoVersion
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}