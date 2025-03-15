package com.example.repository.question

import com.example.model.Question
import kotlinx.coroutines.delay

class QuestionRepositoryImpl : QuestionRepository {
    private val questions = listOf(
        Question(
            id = 1,
            moduleId = 1,
            questionText = "What is the correct way to declare a variable in Kotlin?",
            options = listOf("val x = 5", "var x = 5", "let x = 5", "const x = 5"),
            correctAnswerIndex = 0
        ),
        Question(
            id = 2,
            moduleId = 1,
            questionText = "Which keyword is used to define a function in Kotlin?",
            options = listOf("func", "fun", "def", "function"),
            correctAnswerIndex = 1
        ),
        Question(
            id = 3,
            moduleId = 2,
            questionText = "What is a coroutine in Kotlin?",
            options = listOf("A type of variable", "A lightweight thread", "A function", "A class"),
            correctAnswerIndex = 1
        )
    )

    override suspend fun getQuestionsByModuleId(moduleId: Int): List<Question> {
        delay(500) // Simulate async operation
        return questions.filter { it.moduleId == moduleId }
    }

    override suspend fun getQuestionById(questionId: Int): Question? {
        delay(500) // Simulate async operation
        return questions.find { it.id == questionId }
    }
}