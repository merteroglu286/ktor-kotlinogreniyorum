package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Topic(
    val id: Int? = null,
    val title: String,
    val moduleId: Int? = null,
    val content: List<String>,
    val examples: List<String> = emptyList()
)
