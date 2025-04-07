package com.example.repository.module

import com.example.model.Module
import kotlinx.coroutines.delay

class ModuleRepositoryImpl : ModuleRepository {

    override suspend fun getAllModules(): List<Module> {
        return modules
    }

    override suspend fun getModuleById(moduleId: Int): Module? {
        return modules.find { it.id == moduleId }
    }
}