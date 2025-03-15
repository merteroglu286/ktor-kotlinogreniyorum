package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Question(
    val id: Int,
    val moduleId: Int, // Hangi modüle ait olduğunu belirtmek için
    val questionText: String,
    val options: List<String>, // Şıklar
    val correctAnswerIndex: Int // Doğru cevabın indeksi (0'dan başlayarak)
)
