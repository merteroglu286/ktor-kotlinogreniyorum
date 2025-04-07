package com.example.repository.question

import com.example.model.Question

val questions = listOf(

    //module 1 questions
    Question(
        id = 1,
        moduleId = 1,
        questionText = "Kotlin hangi şirket tarafından geliştirildi?",
        options = listOf("Google", "Microsoft", "JetBrains", "Oracle"),
        correctAnswerIndex = 2
    ),
    Question(
        id = 2,
        moduleId = 1,
        questionText = "Kotlin hangi platform üzerinde çalışır?",
        options = listOf("Windows Kernel", "Java Sanal Makinesi (JVM)", "Android Donanımı", "Python Runtime"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 3,
        moduleId = 1,
        questionText = "Kotlin'in avantajlarından biri değildir?",
        options = listOf(
            "Java ile tam uyumlu olması",
            "NullPointerException hatalarını önlemesi",
            "Daha fazla kod yazmayı gerektirmesi",
            "Fonksiyonel ve nesne yönelimli programlamayı desteklemesi"
        ),
        correctAnswerIndex = 2
    ),
    Question(
        id = 4,
        moduleId = 1,
        questionText = "Aşağıdaki kod bloğu hangi çıktıyı üretir?\n\nfun main() { \n\t\tprintln(\"Hello World!\") \n}",
        options = listOf("Hello", "World!", "Hello World!", "Error"),
        correctAnswerIndex = 2
    ),

    // module 2 questions
    Question(
        id = 5,
        moduleId = 2,
        questionText = "Kotlin'de değişken tanımlamak için hangi anahtar kelimeler kullanılır?",
        options = listOf("let, const", "val, var", "int, float", "define, set"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 6,
        moduleId = 2,
        questionText = "Aşağıdaki değişkenlerden hangisi değiştirilemez?",
        options = listOf("var age = 30", "val pi = 3.14", "var name = \"Kotlin\"", "var isActive = true"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 7,
        moduleId = 2,
        questionText = "Bir metin saklamak için hangi veri tipi kullanılır?",
        options = listOf("Int", "Boolean", "String", "Double"),
        correctAnswerIndex = 2
    ),
    Question(
        id = 8,
        moduleId = 2,
        questionText = "Aşağıdaki veri tiplerinden hangisi tam sayı saklamak için kullanılmaz?",
        options = listOf("Int", "Float", "Long", "Short"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 9,
        moduleId = 2,
        questionText = "Float ve Double arasındaki fark nedir?",
        options = listOf("Float daha büyük sayıları tutabilir.", "Double daha az hassasiyetlidir.", "Float daha az hassasiyete sahiptir.", "Float yalnızca tam sayıları saklar."),
        correctAnswerIndex = 2
    ),
    Question(
        id = 10,
        moduleId = 2,
        questionText = "Aşağıdaki ifadelerden hangisi Boolean veri tipi kullanır?",
        options = listOf("val isKotlinFun: Boolean = true", "val number: Int = 10", "val text: String = \"Hello\"", "val pi: Double = 3.14"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 11,
        moduleId = 2,
        questionText = "String veri tipinde birden fazla karakter saklanabilir mi?",
        options = listOf("Evet", "Hayır"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 12,
        moduleId = 2,
        questionText = "17 sayısını Double türüne çevirmek için hangi Kotlin fonksiyonu kullanılır?",
        options = listOf("toDouble()", "convertToDouble()", "parseDouble()", "asDouble()"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 13,
        moduleId = 2,
        questionText = "Aşağıdaki dönüşümlerden hangisi doğrudur?",
        options = listOf("val number = \"100\".toInt()", "val doubleValue = \"3.14\".toBoolean()", "val booleanValue = \"true\".toInt()", "val charValue = \"A\".toInt()"),
        correctAnswerIndex = 0
    ),

    // Module 3 question
    Question(
        id = 14,
        moduleId = 3,
        questionText = "Aşağıdaki operatörlerden hangisi Kotlin'de 'mod alma' işlemi yapar?",
        options = listOf("%", "/", "*", "+"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 15,
        moduleId = 3,
        questionText = "Hangi operatör iki değerin eşit olup olmadığını kontrol eder?",
        options = listOf("=", "==", "!=", ">="),
        correctAnswerIndex = 1
    ),
    Question(
        id = 16,
        moduleId = 3,
        questionText = "Aşağıdaki kodun çıktısı nedir?\n\nval x = 5\nval y = 3\nprintln(x > y)",
        options = listOf("true", "false", "5", "Hata verir"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 17,
        moduleId = 3,
        questionText = "Mantıksal 'VE' işlemi için hangi operatör kullanılır?",
        options = listOf("||", "&&", "!!", "##"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 18,
        moduleId = 3,
        questionText = "x += 2 ifadesi ne anlama gelir?",
        options = listOf(
            "x = 2",
            "x = x + 2",
            "x = x % 2",
            "x ile 2'yi karşılaştırır"
        ),
        correctAnswerIndex = 1
    ),
    Question(
        id = 20,
        moduleId = 3,
        questionText = "Aşağıdaki ifadelerden hangisi yanlıştır?",
        options = listOf(
            "10 / 3 sonucu 3'dür",
            "10 % 3 sonucu 1'dir",
            "10 * 3 sonucu 30'dur",
            "10 + 3 sonucu 13 değildir"
        ),
        correctAnswerIndex = 3
    ),

    // module 4 question
    Question(
        id = 21,
        moduleId = 4,
        questionText = "Koşullu ifadelerde hangi yapı kullanılmaz?",
        options = listOf("if", "when", "loop", "else"),
        correctAnswerIndex = 2
    ),
    Question(
        id = 22,
        moduleId = 4,
        questionText = "'When' ifadesi ne amaçla kullanılır?",
        options = listOf("Döngü oluşturmak", "Koşullu durumları kontrol etmek", "Değişken tanımlamak", "Sınıf oluşturmak"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 23,
        moduleId = 4,
        questionText = "For döngüsü ne için kullanılır?",
        options = listOf("Bir koleksiyon üzerinde yineleme yapmak", "Koşulları kontrol etmek", "Hata yakalamak", "Metot çağırmak"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 24,
        moduleId = 4,
        questionText = "While döngüsü hangi durumda kullanılmalıdır?",
        options = listOf("Belirli bir aralıkta tekrarlamak için", "Koşul sağlandığı sürece tekrarlamak için", "Kod bloklarını tek sefer çalıştırmak için", "Sadece liste elemanlarını yazdırmak için"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 25,
        moduleId = 4,
        questionText = "Do-while döngüsü ile while döngüsü arasındaki fark nedir?",
        options = listOf("Do-while döngüsü en az bir kez çalışır, while ise koşul doğruysa başlar.", "While döngüsü daha hızlıdır.", "Do-while döngüsü koşullu kontrol etmez.", "While döngüsü sadece negatif sayılar için çalışır."),
        correctAnswerIndex = 0
    ),

    //module 5 question
    Question(
        id = 26,
        moduleId = 5,
        questionText = "Kotlin'de fonksiyon tanımlamak için hangi anahtar kelime kullanılır?",
        options = listOf("func", "function", "fun", "def"),
        correctAnswerIndex = 2
    ),
    Question(
        id = 27,
        moduleId = 5,
        questionText = "Aşağıdaki fonksiyonun çıktısı nedir?\n\nfun selamla() { \n\tprintln(\"Merhaba\") \n}\nselamla()",
        options = listOf("Merhaba", "Hata verir", "Hiçbir şey", "null"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 28,
        moduleId = 5,
        questionText = "Hangi fonksiyon doğru şekilde tanımlanmıştır?",
        options = listOf(
            "fun topla(a: Int, b: Int): Int {\n\treturn a + b\n}",
            "function topla(a, b) {\n\treturn a + b\n}",
            "fun topla(a: Int, b: Int) -> Int {\n\ta + b\n}",
            "def topla(a, b): Int = a + b"
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 29,
        moduleId = 5,
        questionText = "Extension fonksiyon ne yapar?",
        options = listOf(
            "Bir sınıfa yeni bir fonksiyonellik ekler",
            "Bir fonksiyonu siler",
            "Bir değişkeni dönüştürür",
            "Programın çalışmasını durdurur"
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 30,
        moduleId = 5,
        questionText = "Aşağıdaki kodun çıktısı nedir?\n\nfun hesapla(x: Int = 5) = x * 2\nprintln(hesapla(\"3\"))",
        options = listOf("6", "10", "Hata verir", "null"),
        correctAnswerIndex = 2,
    ),

    // Module 6 - Nullability
    Question(
        id = 31,
        moduleId = 6,
        questionText = "Kotlin'de bir değişkeni null değer alabilecek şekilde nasıl tanımlarsınız?",
        options = listOf("var name: String", "var name: String!", "var name: String?", "var name: String*"),
        correctAnswerIndex = 2
    ),
    Question(
        id = 32,
        moduleId = 6,
        questionText = "Elvis operatörü nedir ve ne işe yarar?",
        options = listOf(
            "?: operatörüdür, null değerle karşılaşılırsa alternatif bir değer döndürür.",
            "!! operatörüdür, değişken null ise exception fırlatır.",
            "?. operatörüdür, null güvenli şekilde metotları çağırır.",
            "? operatörüdür, değişken türünü nullable yapar."
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 33,
        moduleId = 6,
        questionText = "Aşağıdaki kod parçasının çıktısı nedir?\n\nval name: String? = null\nval length = name?.length ?: 0\nprintln(length)",
        options = listOf("null", "0", "NullPointerException fırlatır", "Derleme hatası verir"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 34,
        moduleId = 6,
        questionText = "!! operatörünün kullanımı ile ilgili aşağıdakilerden hangisi doğrudur?",
        options = listOf(
            "Değişkenin null olmadığını garanti eder, null ise exception fırlatır.",
            "Değişken null ise null değer döndürür.",
            "Değişken null ise otomatik olarak varsayılan bir değer atar.",
            "Değişkenin nullable olmadığını belirtir."
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 35,
        moduleId = 6,
        questionText = "let fonksiyonu nullable değişkenlerle çalışırken neden kullanışlıdır?",
        options = listOf(
            "null kontrolü yaparak güvenli bir şekilde işlem yapmayı sağlar.",
            "nullable değişkenleri non-nullable hale getirir.",
            "exception fırlatarak hataları yakalar.",
            "nullable değişkenlerin değerlerini otomatik olarak temizler."
        ),
        correctAnswerIndex = 0
    ),

    // Module 7 - Koleksiyonlar
    Question(
        id = 37,
        moduleId = 7,
        questionText = "Kotlin'de aşağıdaki koleksiyon türlerinden hangisi benzersiz elemanları saklar?",
        options = listOf("List", "Array", "Set", "Map"),
        correctAnswerIndex = 2
    ),
    Question(
        id = 38,
        moduleId = 7,
        questionText = "Değiştirilebilir bir liste oluşturmak için hangi fonksiyon kullanılır?",
        options = listOf("listOf()", "arrayOf()", "mutableListOf()", "setOf()"),
        correctAnswerIndex = 2
    ),
    Question(
        id = 39,
        moduleId = 7,
        questionText = "Aşağıdaki kod parçasının çıktısı nedir?\n\nval numbers = listOf(1, 2, 3, 4, 5)\nprintln(numbers.filter { it > 3 })",
        options = listOf("[1, 2, 3]", "[4, 5]", "[3, 4, 5]", "[]"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 40,
        moduleId = 7,
        questionText = "Map veri yapısında anahtar-değer çiftlerini güncellemek için ne yapmalısınız?",
        options = listOf(
            "Değiştirilemez maplar güncellenemez, mutableMapOf() ile oluşturulmuş bir map kullanılmalıdır.",
            "update() metodu kullanılmalıdır.",
            "modify() metodu kullanılmalıdır.",
            "Tüm mapler değiştirilebilirdir, doğrudan güncelleme yapılabilir."
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 41,
        moduleId = 7,
        questionText = "Koleksiyon üzerinde 'map' fonksiyonu ne yapar?",
        options = listOf(
            "Koleksiyondaki her elemanı dönüştürerek yeni bir koleksiyon oluşturur.",
            "Koleksiyonu bir Map veri yapısına dönüştürür.",
            "Koleksiyonu sıralı hale getirir.",
            "Koleksiyondaki elemanları filtreler."
        ),
        correctAnswerIndex = 0
    ),
    // Module 8 - Nesne Yönelimli Programlama (OOP)
    Question(
        id = 42,
        moduleId = 8,
        questionText = "Kotlin'de bir sınıf tanımlamak için hangi anahtar kelime kullanılır?",
        options = listOf("object", "class", "struct", "interface"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 43,
        moduleId = 8,
        questionText = "Primary constructor nerede tanımlanır?",
        options = listOf(
            "Sınıf gövdesinde constructor anahtar kelimesi ile",
            "Sınıf başlığında, sınıf adından sonra",
            "init bloğu içinde",
            "Sadece companion object içinde"
        ),
        correctAnswerIndex = 1
    ),
    Question(
        id = 44,
        moduleId = 8,
        questionText = "Aşağıdakilerden hangisi data class'ın otomatik olarak sağladığı fonksiyonlardan değildir?",
        options = listOf("equals()", "hashCode()", "toString()", "serialize()"),
        correctAnswerIndex = 3
    ),
    Question(
        id = 45,
        moduleId = 8,
        questionText = "Kotlin'de bir sınıfın başka bir sınıftan türetilebilmesi için ne yapılmalıdır?",
        options = listOf(
            "Üst sınıf 'open' anahtar kelimesi ile işaretlenmeli",
            "Alt sınıf 'extends' anahtar kelimesi kullanmalı",
            "Üst sınıf 'abstract' olmalı",
            "Herhangi bir özel işlem gerekmez"
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 46,
        moduleId = 8,
        questionText = "Aşağıdaki kodun çıktısı nedir?\n\nobject Singleton {\n\tval id = 1\n}\nprintln(Singleton.id)",
        options = listOf("1", "null", "Hata verir", "0"),
        correctAnswerIndex = 0
    ),
    Question(
        id = 47,
        moduleId = 8,
        questionText = "Companion object ne işe yarar?",
        options = listOf(
            "Sınıfın static üyelerini tanımlamak için kullanılır",
            "Yalnızca bir kez oluşturulan singleton nesnedir",
            "Kalıtım için kullanılır",
            "Interface'leri uygulamak için kullanılır"
        ),
        correctAnswerIndex = 0
    ),

    // Module 9 - Fonksiyonel Programlama
    Question(
        id = 48,
        moduleId = 9,
        questionText = "Lambda ifadeleri Kotlin'de nasıl tanımlanır?",
        options = listOf(
            "{} içinde parametreler ve gövde ile",
            "[] içinde parametreler ile",
            "fun anahtar kelimesi ile",
            "lambda anahtar kelimesi ile"
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 49,
        moduleId = 9,
        questionText = "Higher-order fonksiyon nedir?",
        options = listOf(
            "Parametre olarak fonksiyon alan veya fonksiyon döndüren fonksiyon",
            "Sadece yüksek seviyeli matematik işlemleri yapan fonksiyon",
            "Sınıfın en üst seviyesinde tanımlanan fonksiyon",
            "Extension fonksiyonlar için kullanılan terim"
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 50,
        moduleId = 9,
        questionText = "Aşağıdaki scope fonksiyonlarından hangisi 'this' anahtar kelimesini receiver olarak kullanır?",
        options = listOf("let", "with", "also", "takeIf"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 51,
        moduleId = 9,
        questionText = "Aşağıdaki kodun çıktısı nedir?\n\nval numbers = listOf(1, 2, 3)\nval doubled = numbers.map { it * 2 }\nprintln(doubled)",
        options = listOf("[1, 2, 3]", "[2, 4, 6]", "[1, 4, 9]", "[3, 6, 9]"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 52,
        moduleId = 9,
        questionText = "filter fonksiyonu ne yapar?",
        options = listOf(
            "Koleksiyondaki elemanları dönüştürür",
            "Belirli bir koşulu sağlayan elemanları seçer",
            "Koleksiyonu sıralar",
            "Koleksiyonu gruplandırır"
        ),
        correctAnswerIndex = 1
    ),

    // Module 10 - Hata Yönetimi
    Question(
        id = 53,
        moduleId = 10,
        questionText = "Kotlin'de exception yakalamak için hangi yapı kullanılır?",
        options = listOf("try-except", "try-catch", "catch-throw", "handle-exception"),
        correctAnswerIndex = 1
    ),
    Question(
        id = 54,
        moduleId = 10,
        questionText = "finally bloğu ne zaman çalışır?",
        options = listOf(
            "Sadece exception oluştuğunda",
            "Sadece exception oluşmadığında",
            "Her durumda (exception oluşsa da oluşmasa da)",
            "Program başarılı olduğunda"
        ),
        correctAnswerIndex = 2
    ),
    Question(
        id = 55,
        moduleId = 10,
        questionText = "Özel exception sınıfı oluşturmak için ne yapılmalıdır?",
        options = listOf(
            "Exception sınıfından türetilmeli",
            "Error sınıfından türetilmeli",
            "Throwable arayüzü uygulanmalı",
            "RuntimeException sınıfından türetilmeli"
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 56,
        moduleId = 10,
        questionText = "Result sınıfı ne işe yarar?",
        options = listOf(
            "Fonksiyonel programlama tarzında hata yönetimi sağlar",
            "Matematiksel işlem sonuçlarını saklar",
            "Koleksiyon işlemlerinin sonucunu tutar",
            "Veritabanı sorgu sonuçlarını temsil eder"
        ),
        correctAnswerIndex = 0
    ),
    Question(
        id = 57,
        moduleId = 10,
        questionText = "Aşağıdaki kodun çıktısı nedir?\n\nval result = runCatching { 10 / 0 }\nprintln(result.isFailure)",
        options = listOf("true", "false", "0", "Hata verir"),
        correctAnswerIndex = 0
    )
)