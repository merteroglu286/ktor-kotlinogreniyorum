package com.example.repository.topic

import com.example.model.Topic

interface TopicRepository {
    suspend fun getTopicsByModuleId(moduleId: Int): List<Topic>
    suspend fun getTopicById(topicId: Int): Topic?
}