package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Question(
    val id: Int,
    val moduleId: Int,
    val questionText: String,
    val options: List<String>,
    val correctAnswerIndex: Int
)
