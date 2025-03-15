package com.example.model

import kotlinx.serialization.Serializable

@Serializable
sealed class ApiResponse<out T> {
    @Serializable
    data class Success<out T>(val data: T) : ApiResponse<T>()

    @Serializable
    data class Error(val message: String, val code: Int) : ApiResponse<Nothing>()
}