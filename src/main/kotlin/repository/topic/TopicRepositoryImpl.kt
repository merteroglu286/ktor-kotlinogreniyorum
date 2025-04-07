package com.example.repository.topic

import com.example.model.Topic
import kotlinx.coroutines.delay

class TopicRepositoryImpl : TopicRepository {

    override suspend fun getTopicsByModuleId(moduleId: Int): List<Topic> {
        return topics.filter { it.moduleId == moduleId }
    }

    override suspend fun getTopicById(topicId: Int): Topic? {
        return topics.find { it.id == topicId }
    }
}