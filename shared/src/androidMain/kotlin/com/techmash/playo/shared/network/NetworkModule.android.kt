package com.techmash.playo.shared.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

actual val httpClient: HttpClient =  HttpClient() {
    // default validation to throw exceptions for non-2xx responses
    expectSuccess = true

    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }

    // set default request parameters
    defaultRequest {
        // add base url for all request
        url("https://staging.playo.io/")
        header("Authorization", "5534898698eb3426d00168b6ed447d23d000026552ed6200")
    }
}