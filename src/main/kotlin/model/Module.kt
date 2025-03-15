package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Module(
    val id: Int? = null,
    val title: String,
    val description: String
)