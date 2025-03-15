package com.example.repository.module

import com.example.model.Module

interface ModuleRepository {
    suspend fun getAllModules(): List<Module>
    suspend fun getModuleById(moduleId: Int): Module?
}