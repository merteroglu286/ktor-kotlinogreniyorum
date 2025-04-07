// Routing.kt
package com.example.plugins

import com.example.model.ApiResponse
import com.example.repository.module.ModuleRepository
import com.example.repository.question.QuestionRepository
import com.example.repository.topic.TopicRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val moduleRepository by inject<ModuleRepository>()
    val topicRepository by inject<TopicRepository>()
    val questionRepository by inject<QuestionRepository>()

    routing {
        get("/modules") {
            try {
                val modules = moduleRepository.getAllModules()
                call.respond(ApiResponse.Success(modules))
            } catch (e: Exception) {
                call.respond(
                    ApiResponse.Error(
                        message = "An unexpected error occurred: ${e.message}",
                        code = HttpStatusCode.InternalServerError.value
                    )
                )
            }
        }

        get("/modules/{id}/topics") {
            try {
                val moduleId = call.parameters["id"]?.toIntOrNull()
                if (moduleId == null) {
                    call.respond(
                        ApiResponse.Error(
                            message = "Invalid module ID",
                            code = HttpStatusCode.BadRequest.value
                        )
                    )
                    return@get
                }

                val module = moduleRepository.getModuleById(moduleId)
                if (module == null) {
                    call.respond(
                        ApiResponse.Error(
                            message = "Module not found",
                            code = HttpStatusCode.NotFound.value
                        )
                    )
                    return@get
                }

                val topics = topicRepository.getTopicsByModuleId(moduleId)

                if (topics.isEmpty()) {
                    call.respond(
                        ApiResponse.Error(
                            message = "No topics found for this module",
                            code = HttpStatusCode.NotFound.value
                        )
                    )
                    return@get
                }

                call.respond(ApiResponse.Success(topics))
            } catch (e: Exception) {
                call.respond(
                    ApiResponse.Error(
                        message = "An unexpected error occurred: ${e.message}",
                        code = HttpStatusCode.InternalServerError.value
                    )
                )
            }
        }

        get("/modules/{id}/questions") {
            try {
                val moduleId = call.parameters["id"]?.toIntOrNull()
                if (moduleId == null) {
                    call.respond(
                        ApiResponse.Error(
                            message = "Invalid module ID",
                            code = HttpStatusCode.BadRequest.value
                        )
                    )
                    return@get
                }

                val module = moduleRepository.getModuleById(moduleId)
                if (module == null) {
                    call.respond(
                        ApiResponse.Error(
                            message = "Module not found",
                            code = HttpStatusCode.NotFound.value
                        )
                    )
                    return@get
                }

                val questions = questionRepository.getQuestionsByModuleId(moduleId)
                call.respond(ApiResponse.Success(questions))
            } catch (e: Exception) {
                call.respond(
                    ApiResponse.Error(
                        message = "An unexpected error occurred: ${e.message}",
                        code = HttpStatusCode.InternalServerError.value
                    )
                )
            }
        }

        post("/questions/{id}/answer") {
            try {
                val questionId = call.parameters["id"]?.toIntOrNull()
                if (questionId == null) {
                    call.respond(
                        ApiResponse.Error(
                            message = "Invalid question ID",
                            code = HttpStatusCode.BadRequest.value
                        )
                    )
                    return@post
                }

                // Sorunun var olup olmadığını kontrol et
                val question = questionRepository.getQuestionById(questionId)
                if (question == null) {
                    call.respond(
                        ApiResponse.Error(
                            message = "Question not found",
                            code = HttpStatusCode.NotFound.value
                        )
                    )
                    return@post
                }

                // Kullanıcının cevabını al
                val userAnswer = call.request.queryParameters["answer"]?.toIntOrNull()
                if (userAnswer == null) {
                    call.respond(
                        ApiResponse.Error(
                            message = "Invalid answer",
                            code = HttpStatusCode.BadRequest.value
                        )
                    )
                    return@post
                }

                // Cevabı kontrol et
                val isCorrect = userAnswer == question.correctAnswerIndex
                call.respond(
                    ApiResponse.Success(
                        mapOf(
                            "isCorrect" to isCorrect,
                            "correctAnswer" to question.correctAnswerIndex
                        )
                    )
                )
            } catch (e: Exception) {
                call.respond(
                    ApiResponse.Error(
                        message = "An unexpected error occurred: ${e.message}",
                        code = HttpStatusCode.InternalServerError.value
                    )
                )
            }
        }
    }
}