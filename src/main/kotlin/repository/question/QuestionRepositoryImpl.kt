package com.example.repository.question

import com.example.model.Question
import kotlinx.coroutines.delay

class QuestionRepositoryImpl : QuestionRepository {

    override suspend fun getQuestionsByModuleId(moduleId: Int): List<Question> {
        return questions.filter { it.moduleId == moduleId }
    }

    override suspend fun getQuestionById(questionId: Int): Question? {
        return questions.find { it.id == questionId }
    }
}