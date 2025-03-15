package com.example.repository.topic

import com.example.model.Topic
import kotlinx.coroutines.delay

class TopicRepositoryImpl : TopicRepository {
    private val topics = listOf(
        // Module 1 Topics
        Topic(
            id = 1,
            title = "Kotlin Nedir?",
            moduleId = 1,
            content = listOf(
                "Kotlin, JetBrains tarafından geliştirilen ve Java Sanal Makinesi (JVM) üzerinde çalışan, açık kaynaklı, statik tipli bir programlama dilidir.",
                "2011 yılında duyurulan ve 2016 yılında ilk resmi sürümü yayınlanan Kotlin, modern yazılım geliştirme ihtiyaçlarını karşılamak üzere tasarlanmıştır.",
                "Kotlin, Java ile tam uyumludur ve Android geliştirme için resmi dil olarak desteklenmektedir."
            )
        ),
        Topic(
            id = 2,
            title = "Kotlin'in Avantajları",
            moduleId = 1,
            content = listOf(
                "Kotlin, Java ile tam uyumlu olduğu için mevcut Java projelerine kolayca entegre edilebilir.",
                "Null güvenliği sayesinde NullPointerException hatalarını önler.",
                "Daha az kod yazmayı sağlayarak geliştirme sürecini hızlandırır.",
                "Fonksiyonel programlama ve nesne yönelimli programlama (OOP) paradigmalarını destekler."
            )
        ),
        Topic(
            id = 3,
            title = "Kurulum ve İlk Program",
            moduleId = 1,
            content = listOf(
                "Kotlin'i kullanmak için IntelliJ IDEA veya Android Studio gibi bir IDE kurmanız gerekmektedir.",
                "IntelliJ IDEA, Kotlin'i varsayılan olarak destekler. Android Studio'da ise Kotlin eklentisini kurmanız gerekebilir.",
                "İlk Kotlin programınızı oluşturmak için yeni bir proje açın ve bir Kotlin dosyası oluşturun.",
                "Kotlin'de 'Hello World' programı oldukça basittir:"
            ),
            examples = listOf(
                "fun main() { println(\"Hello World!\") }"
            )
        ),
        // Module 2 Topics
        Topic(
            id = 4,
            title = "Kotlin'de Değişkenler",
            moduleId = 2,
            content = listOf(
                "Değişkenler, verileri saklamak için kullanılan isimlendirilmiş depolama alanlarıdır.",
                "Kotlin'de değişken tanımlamak için val ve var kullanılır.",
                "val (değiştirilemez) ve var (değiştirilebilir) olmak üzere iki temel değişken türü bulunur."
            ),
            examples = listOf(
                "val pi = 3.14 // Sabit bir değer, değiştirilemez.",
                "var age = 25 // Değiştirilebilir bir değer.",
                "age = 26 // var değişkeni değiştirilebilir olduğu için yeni bir değer atanabilir."
            )
        ),
        Topic(
            id = 5,
            title = "Temel Veri Tipleri",
            moduleId = 2,
            content = listOf(
                "Kotlin'deki temel veri tipleri şunlardır:",
                "Sayısal tipler: Byte, Short, Int, Long, Float, Double",
                "Mantıksal tip: Boolean",
                "Metin tipi: Char, String"
            ),
            examples = listOf(
                "val number: Int = 10",
                "val isKotlinFun: Boolean = true",
                "val letter: Char = 'A'",
                "val name: String = \"Kotlin\""
            )
        ),
        Topic(
            id = 6,
            title = "Tür Dönüşümleri",
            moduleId = 2,
            content = listOf(
                "Tür dönüşümleri, bir veri tipini başka bir veri tipine çevirmeyi sağlar.",
                "Örneğin, Int bir değeri Double'a çevirebilirsiniz."
            ),
            examples = listOf(
                "val number = 42",
                "val doubleNumber = number.toDouble() // Int → Double dönüşümü"
            )
        )
    )

    override suspend fun getTopicsByModuleId(moduleId: Int): List<Topic> {
        delay(500) // Simulate async operation
        return topics.filter { it.moduleId == moduleId }
    }

    override suspend fun getTopicById(topicId: Int): Topic? {
        delay(500) // Simulate async operation
        return topics.find { it.id == topicId }
    }
}