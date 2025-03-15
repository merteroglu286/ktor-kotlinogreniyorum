package com.example.repository.question

import com.example.model.Question

interface QuestionRepository {
    suspend fun getQuestionsByModuleId(moduleId: Int): List<Question>
    suspend fun getQuestionById(questionId: Int): Question?
}