package com.example

import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.time.Duration

fun Application.configureDefaultHeaders(){
    install(DefaultHeaders){
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(
            name = io.ktor.http.HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable"
        )
    }
}