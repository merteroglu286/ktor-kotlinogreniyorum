package com.example.repository.module

import com.example.model.Module
import kotlinx.coroutines.delay

class ModuleRepositoryImpl : ModuleRepository {
    private val modules = listOf(
        Module(1, "Kotlin'e Giriş", "Kotlin dilinin temel özellikleri ve programlamaya giriş."),
        Module(2, "Değişkenler ve Veri Tipleri", "Değişken tanımlama, veri tipleri ve temel kavramlar."),
        Module(3, "Kontrol Yapıları", "Koşullu ifadeler ve döngülerle program akışını yönetme."),
        Module(4, "Fonksiyonlar", "Fonksiyon oluşturma, kullanma ve temel fonksiyonel yapılar."),
        Module(5, "Nullability", "Null değerlerle güvenli bir şekilde çalışma yöntemleri."),
        Module(6, "Koleksiyonlar", "List, Set ve Map gibi koleksiyonları kullanma ve koleksiyon işlemleri."),
        Module(7, "Nesne Yönelimli Programlama (OOP)", "Sınıflar, nesneler ve temel OOP prensipleri."),
        Module(8, "Fonksiyonel Programlama", "Lambda ifadeleri, higher-order fonksiyonlar ve modern programlama teknikleri."),
        Module(9, "Hata Yönetimi", "Programda oluşabilecek hataları yönetme ve kontrol etme."),
        Module(10, "Asenkron Programlama", "Eşzamanlı işlemler ve asenkron programlama teknikleri.")
    )

    override suspend fun getAllModules(): List<Module> {
        delay(500) // Simulate async operation
        return modules
    }

    override suspend fun getModuleById(moduleId: Int): Module? {
        delay(500) // Simulate async operation
        return modules.find { it.id == moduleId }
    }
}