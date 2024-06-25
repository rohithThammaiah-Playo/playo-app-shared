package com.techmash.playo.shared.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.header
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

actual val httpClient: HttpClient =  HttpClient(Darwin) {
    engine{
        configureRequest{
            setAllowsCellularAccess(true)
        }
    }
    defaultRequest {
        // add base url for all request
        url("https://staging.playo.io/")
        header("Authorization", "5534898698eb3426d00168b6ed447d23d000026552ed6200")
    }



    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }
}