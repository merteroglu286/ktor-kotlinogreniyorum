package com.example.di

import com.example.repository.module.ModuleRepository
import com.example.repository.module.ModuleRepositoryImpl
import com.example.repository.question.QuestionRepository
import com.example.repository.question.QuestionRepositoryImpl
import com.example.repository.topic.TopicRepository
import com.example.repository.topic.TopicRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<ModuleRepository> { ModuleRepositoryImpl() }
    single<TopicRepository> { TopicRepositoryImpl() }
    single<QuestionRepository> {QuestionRepositoryImpl()}
}