package com.example.repository.topic

import com.example.model.Topic

val topics = listOf(
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
            "fun main() { \n\t\tprintln(\"Hello World!\") \n\t}"
        )
    ),


    // Module 2 Topics
    Topic(
        id = 4,
        title = "Kotlin'de Değişkenler",
        moduleId = 2,
        content = listOf(
            "Değişkenler, verileri saklamak için kullanılan isimlendirilmiş bellek alanlarıdır.",
            "Kotlin'de değişken tanımlamak için val, var ve const anahtar kelimeleri kullanılır.",
            "val, değeri sonradan değiştirilemeyen değişkenler tanımlamak için kullanılır.",
            "var, değeri sonradan değiştirilebilen değişkenler için kullanılır.",
            "const, derleme zamanında belirlenen ve program çalışırken değiştirilemeyen sabitleri tanımlamak için kullanılır."
        ),
        examples = listOf(
            "val pi = 3.14",
            "\nvar age = 2",
            "age = 26",
            "\nconst val MAX_AGE = 100"
        )
    ),
    Topic(
        id = 5,
        title = "Temel Veri Tipleri",
        moduleId = 2,
        content = listOf(
            "Veri tipi (data type), bir değişkenin bellekte nasıl saklanacağını ve hangi türde değerler alacağını belirleyen bir özelliktir.",
            "Programlama dillerinde her değişkenin bir veri tipi vardır ve bu veri tipi, değişkenin hangi işlemleri desteklediğini belirler.",
            "Örneğin, bir sayı saklamak için Int veya Double kullanırken, metin saklamak için String kullanırız.",
        )
    ),
    Topic(
        id = 6,
        title = "Sayısal Veri Tipleri",
        moduleId = 2,
        content = listOf(
            "Byte: 8 bit, -128 ile 127 arasında değer alır.",
            "Short: 16 bit, -32,768 ile 32,767 arasında değer alır.",
            "Int: 32 bit, -2,147,483,648 ile 2,147,483,647 arasında değer alır.",
            "Long: 64 bit, çok büyük tamsayı değerleri tutabilir.",
            "Float: 32 bit, ondalıklı sayıları temsil eder, hassasiyet daha düşüktür.",
            "Double: 64 bit, daha hassas ondalıklı sayılar için kullanılır.",
        ),
        examples = listOf(
            "val byteNumber: Byte = 25",
            "val shortNumber: Short = 1500",
            "val intNumber: Int = 10000",
            "val longNumber: Long = 500000L",
            "val floatNumber: Float = 2.5f",
            "val doubleNumber: Double = 1.234567"
        )
    ),
    Topic(
        id = 7,
        title = "Mantıksal Veri Tipi",
        moduleId = 2,
        content = listOf(
            "Boolean: true veya false değerini alır, mantıksal işlemlerde kullanılır."
        ),
        examples = listOf(
            "val isKotlinFun: Boolean = true",
        )
    ),
    Topic(
        id = 8,
        title = "Metin Veri Tipleri",
        moduleId = 2,
        content = listOf(
            "Char: Tek bir karakteri temsil eder.",
            "String: Birden fazla karakter içeren metinleri tutar."
        ),
        examples = listOf(
            "val letter: Char = 'A'",
            "val name: String = \"Kotlin\""
        )
    ),
    Topic(
        id = 9,
        title = "Tür Dönüşümleri",
        moduleId = 2,
        content = listOf(
            "Tür dönüşümleri, bir veri tipini başka bir veri tipine çevirmeyi sağlar.",
            "Örneğin, Int bir değeri Double'a çevirebilirsiniz."
        ),
        examples = listOf(
            "val number1 = 42",
            "val doubleNumber = number.toDouble() // 42.0 ",
            "",
            "val number2 = 35",
            "val stringNumber = number2.toString() // \"35\" "
        )
    ),

    //module 3 topic

    Topic(
        id = 10,
        title = "Aritmetik Operatörler",
        moduleId = 3,
        content = listOf(
            "Aritmetik operatörler, temel matematiksel işlemleri gerçekleştirmek için kullanılır.",
            "Toplama (+): İki sayıyı toplar.",
            "Çıkarma (-): İki sayının farkını alır.",
            "Çarpma (*): İki sayının çarpımını hesaplar.",
            "Bölme (/): İki sayının bölümünü hesaplar.",
            "Mod Alma (%): İki sayının bölümünden kalanı verir."
        ),
        examples = listOf(
            "val sum = 5 + 3 // 8",
            "val difference = 10 - 4 // 6",
            "val product = 6 * 7 // 42",
            "val quotient = 15 / 4 // 3 (tamsayı bölme)",
            "val remainder = 15 % 4 // 3"
        )
    ),

    Topic(
        id = 11,
        title = "Karşılaştırma ve Mantıksal Operatörler",
        moduleId = 3,
        content = listOf(
            "Karşılaştırma Operatörleri:",
            "- Eşitlik (==): İki değerin eşit olup olmadığını kontrol eder",
            "- Eşit Değil (!=): İki değerin farklı olup olmadığını kontrol eder",
            "- Büyüktür/Küçüktür (>, <): Sayısal karşılaştırmalar yapar",
            "- Büyük Eşit/Küçük Eşit (>=, <=): Eşitlik durumunu da içeren karşılaştırmalar",
            "\nMantıksal Operatörler:",
            "- Ve (&&): Tüm koşulların doğru olmasını gerektirir",
            "- Veya (||): Koşullardan birinin doğru olmasını yeterli görür",
            "- Değil (!): Bir boolean değerini tersine çevirir"
        ),
        examples = listOf(
            "val isEqual = (5 == 5) // true",
            "val isGreater = (10 > 5) // true",
            "val logicalTest = (5 > 3) && (10 < 20) // true",
            "val isTrue = !false // true"
        )
    ),
    Topic(
        id = 15,
        title = "Atama ve Arttırma/Azaltma Operatörleri",
        moduleId = 3,
        content = listOf(
            "Atama Operatörleri:",
            "- Temel Atama (=): Değişkene değer atar",
            "- Bileşik Atamalar (+=, -=, *=, /=, %=): İşlem ve atamayı birleştirir",

            "\nArttırma/Azaltma Operatörleri:",
            "- Önce Arttırma (++x): Değeri artırır, sonra kullanır",
            "- Sonra Arttırma (x++): Değeri kullanır, sonra artırır",
            "- Önce Azaltma (--x): Değeri azaltır, sonra kullanır",
            "- Sonra Azaltma (x--): Değeri kullanır, sonra azaltır"
        ),
        examples = listOf(
            "var x = 5\nx += 3 // x = 8",
            "\nvar a = 10\na *= 2 // a = 20",
            "\nvar b = 5\nval c = ++b // b = 6, c = 6",
            "\nvar d = 5\nval e = d++ // e = 5, d = 6"
        )
    ),


    //module 4 topic
    Topic(
        id = 16,
        title = "Koşullu İfadeler",
        moduleId = 4,
        content = listOf(
            "Koşullu ifadeler, belirli bir koşula göre farklı kod bloklarının çalışmasını sağlar.",
            "Kotlin'de 'if', 'else if' ve 'else' yapıları kullanılır.",
            "'if' yapısı bir koşulu kontrol eder, 'else if' başka bir koşul kontrol eder ve 'else' ise diğer koşullar sağlanamadığında çalışacak kodu belirtir."
        ),
        examples = listOf(
            "val age = 25",
            "if (age < 13) {\n" +
                    "    println(\"Çocuk\")\n" +
                    "} else if (age >= 13 && age <= 19) {\n" +
                    "    println(\"Genç\")\n" +
                    "} else if (age >= 20 && age <= 59) {\n" +
                    "    println(\"Yetişkin\")\n" +
                    "} else {\n" +
                    "    println(\"Yaşlı\")\n" +
                    "}"
        )
    ),
    Topic(
        id = 17,
        title = "When Kullanımı",
        moduleId = 4,
        content = listOf(
            "'When', birden fazla durumu kontrol etmek için kullanılan bir yapıdır.",
            "'Switch-case' yapısına benzer fakat daha esnek ve güçlüdür.",
            "Bir değişkenin değerine göre farklı kod bloklarını çalıştırabilir."
        ),
        examples = listOf(
            "val day = 3",
            "val result = when(day) { \n\t1 -> \"Pazartesi\" \n\t2 -> \"Salı\" \n\telse -> \"Hafta sonu\" \n}"
        )
    ),
    Topic(
        id = 18,
        title = "Döngüler",
        moduleId = 4,
        content = listOf(
            "Döngüler, belirli bir koşul sağlandığı sürece kod bloklarının tekrar çalışmasını sağlar.",
            "Kotlin'de 'for' ve 'while' döngülerine ek olarak 'do-while' döngüsü de bulunur.",
            "For döngüsü genellikle koleksiyonlar ve aralıklar üzerinde yineleme yapmak için kullanılır."
        ),
        examples = listOf(
            "for (i in 1..5) { \n\t\tprintln(i) \n}",
            "\nvar count = 0\nwhile (count < 5) { \n\t\tprintln(count); count++ \n}"
        )
    ),

    //module 5 topic
    Topic(
        id = 19,
        title = "Fonksiyon Tanımlama ve Çağırma",
        moduleId = 5,
        content = listOf(
            "Fonksiyonlar, belirli bir işlevi gerçekleştiren yeniden kullanılabilir kod bloklarıdır.",
            "`fun` anahtar kelimesi ile tanımlanır.",
            "Parametre alabilir ve değer döndürebilir (return).",
            "Fonksiyon çağrımı: `fonksiyonAdı(parametreler)` şeklinde yapılır."
        ),
        examples = listOf(
            "// Parametresiz fonksiyon\nfun selamla() {\n    println(\"Merhaba!\")\n}",
            "// Çağırma\nselamla()",
            "\n// Parametreli fonksiyon\nfun topla(a: Int, b: Int) {\n    println(a + b)\n}",
            "// Çağırma\ntopla(3, 5)"
        )
    ),
    Topic(
        id = 20,
        title = "Return Değerleri",
        moduleId = 5,
        content = listOf(
            "Fonksiyonlar `return` ile değer döndürebilir.",
            "Dönüş tipi fonksiyon tanımında belirtilmelidir (Örn: `fun isim(): String`).",
            "Unit tipi (Java'daki void), değer döndürmediğini belirtir."
        ),
        examples = listOf(
            "fun kareAl(x: Int): Int {\n    return x * x\n}",
            "val sonuc = kareAl(4) // 16",
            "\n// Tek ifadeli fonksiyon (Single-Expression):\nfun kareAl(x: Int) = x * x"
        )
    ),
    Topic(
        id = 21,
        title = "Esnek Parametreler",
        moduleId = 5,
        content = listOf(
            "Default Parametre: Fonksiyon çağrımında parametre atlanırsa varsayılan değer kullanılır.",
            "Named Parametre: Parametreleri isim belirterek sırasız verebilme özelliği."
        ),
        examples = listOf(
            "fun mesajYaz(\ntext: String = \"Varsayılan Mesaj\"\n) {\n    println(text)\n}",
            "mesajYaz() // Varsayılan Mesaj",
            "\nfun bilgiler(ad: String, yas: Int) {\n    println(\"\$ad, \$yas yaşında\")\n}",
            "bilgiler(yas = 25, ad = \"Ahmet\") // Ahmet, 25 yaşında"
        )
    ),
    Topic(
        id = 22,
        title = "Extension Fonksiyonlar",
        moduleId = 5,
        content = listOf(
            "Mevcut bir sınıfa yeni fonksiyon ekleme imkanı sağlar.",
            "Örnek: `String` sınıfına özel bir fonksiyon ekleyebilirsiniz."
        ),
        examples = listOf(
            "fun String.buyukHarfYap(): String {\n    return this.uppercase()\n}",
            "val sonuc = \"kotlin\".buyukHarfYap() // \"KOTLIN\""
        )
    ),

    // Modül 6 - Nullability
    Topic(
        id = 23,
        title = "Nullability Kavramı",
        moduleId = 6,
        content = listOf(
            "Null, bir değişkenin henüz bir değer içermediğini veya boş olduğunu gösterir.",
            "Kotlin'de, Java'dan farklı olarak, varsayılan olarak hiçbir değişken null değer alamaz.",
            "Null olabilecek değişkenleri tanımlamak için tip sonuna '?' eklenir.",
            "Bu yaklaşım, NullPointerException hatalarını önemli ölçüde azaltır."
        ),
        examples = listOf(
            "// Null olamaz\nvar name: String = \"Kotlin\"",
            "\n// Null olabilir\nvar nullableName: String? = null"
        )
    ),
    Topic(
        id = 24,
        title = "Null Güvenli Operatörler",
        moduleId = 6,
        content = listOf(
            "?. (Güvenli Çağrı Operatörü): Null değilse işlemi gerçekleştirir, null ise null döner.",
            "?: (Elvis Operatörü): Sol taraf null ise, sağ taraftaki değeri kullanır.",
            "!! (Not-null Assertion): Değerin kesinlikle null olmadığını belirtir, null ise NullPointerException fırlatır."
        ),
        examples = listOf(
            "val length = nullableName?.length // null ise sonuç null olur",
            "\nval nonNullLength = nullableName?.length ?: 0 // null ise 0 olur",
            "\n// !! kullanımı - dikkatli olmalısınız",
            "val forcedLength = nullableName!!.length // null ise exception fırlatır"
        )
    ),
    Topic(
        id = 25,
        title = "Null Güvenli Dönüşümler",
        moduleId = 6,
        content = listOf(
            "Kotlin, null değerlerle çalışmak için güvenli dönüşüm operatörleri sunar.",
            "as? (Güvenli Cast): Dönüşüm başarısız olursa null döner.",
            "let, run, apply gibi scope fonksiyonları null kontrolü için yaygın kullanılır."
        ),
        examples = listOf(
            "val sayi: Any = \"5\"",
            "val asInteger: Int? = sayi as? Int // Başarısız olacak, sonuç null",
            "\n// let kullanımı",
            "nullableName?.let {",
            "    println(\"İsim: \$it\")",
            "} // nullableName null ise hiçbir şey yapmaz"
        )
    ),

    // Modül 7 - Koleksiyonlar
    Topic(
        id = 26,
        title = "Koleksiyon Türleri",
        moduleId = 7,
        content = listOf(
            "Koleksiyonlar, birden fazla öğeyi tek bir yapıda saklamak için kullanılır.",
            "Kotlin'de üç ana koleksiyon türü bulunur:",
            "List: Sıralı elemanları saklar ve indeks ile erişim sağlar.",
            "Set: Benzersiz elemanları saklar, sıra garantisi yoktur.",
            "Map: Anahtar-değer çiftlerini saklar."
        ),
        examples = listOf(
            "// List örneği",
            "val numbers = listOf(1, 2, 3, 4, 5)",
            "val mutableNumbers = mutableListOf(1, 2, 3)",
            "\n// Set örneği",
            "val uniqueNumbers = setOf(1, 2, 3, 3, 4) // [1, 2, 3, 4]",
            "\n// Map örneği",
            "val ages = mapOf(\"Ali\" to 25, \"Ayşe\" to 30)"
        )
    ),
    Topic(
        id = 27,
        title = "Değiştirilebilir ve Değiştirilemez Koleksiyonlar",
        moduleId = 7,
        content = listOf(
            "Kotlin'de koleksiyonlar iki kategoriye ayrılır:",
            "Değiştirilemez (Immutable): listOf(), setOf(), mapOf() ile oluşturulur. Oluşturulduktan sonra değiştirilemezler.",
            "Değiştirilebilir (Mutable): mutableListOf(), mutableSetOf(), mutableMapOf() ile oluşturulur. Oluşturulduktan sonra değiştirilebilirler.",
            "Değiştirilemez koleksiyonlar thread-safe özelliği taşır ve çoklu iş parçacıklı uygulamalarda güvenle kullanılabilir."
        ),
        examples = listOf(
            "// Değiştirilemez liste",
            "val immutableList = listOf(\"a\", \"b\", \"c\")",
            "// immutableList.add(\"d\") // Hata verir!",
            "\n// Değiştirilebilir liste",
            "val mutableList = mutableListOf(\"a\", \"b\", \"c\")",
            "mutableList.add(\"d\") // [\"a\", \"b\", \"c\", \"d\"]"
        )
    ),
    Topic(
        id = 28,
        title = "Koleksiyon İşlemleri",
        moduleId = 7,
        content = listOf(
            "Kotlin, koleksiyonlar üzerinde işlem yapmak için zengin bir fonksiyon seti sunar:",
            "filter(): Belirli bir koşulu sağlayan öğeleri filtreleme",
            "map(): Koleksiyondaki her öğeyi dönüştürme",
            "forEach(): Koleksiyondaki her öğe için işlem yapma",
            "find(): Belirli bir koşulu sağlayan ilk öğeyi bulma",
            "any(), all(), none(): Koleksiyondaki öğelerin belirli bir koşulu sağlayıp sağlamadığını kontrol etme",
            "groupBy(): Öğeleri belirli bir kritere göre gruplandırma",
            "sorted(), sortedBy(): Koleksiyonu sıralama"
        ),
        examples = listOf(
            "val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)",
            "\n// Filtreleme",
            "val evenNumbers = numbers.filter { it % 2 == 0 } // [2, 4, 6, 8, 10]",
            "\n// Dönüştürme",
            "val squared = numbers.map { it * it } // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]",
            "\n// forEach kullanımı",
            "numbers.forEach { println(it) }"
        )
    ),

    // Modül 8 - Nesne Yönelimli Programlama (OOP)
    Topic(
        id = 29,
        title = "Sınıflar ve Nesneler",
        moduleId = 8,
        content = listOf(
            "Sınıf (Class): Nesnelerin şablonunu tanımlayan yapıdır.",
            "Nesne (Object): Sınıftan türetilen ve bellek alanı ayrılan somut örneklerdir.",
            "Kotlin'de sınıflar 'class' anahtar kelimesi ile tanımlanır.",
            "Sınıflar özellikler (properties) ve metotlar (methods) içerebilir.",
            "Nesneler, sınıfın constructor'ı çağrılarak oluşturulur."
        ),
        examples = listOf(
            "// Sınıf tanımlama",
            "class Person {",
            "    var name: String = \"\"",
            "    var age: Int = 0",
            "",
            "    fun introduce() {",
            "        println(\"Merhaba, ben \$name ve \$age yaşındayım.\")",
            "    }",
            "}",
            "\n// Nesne oluşturma",
            "val person = Person()",
            "person.name = \"Ali\"",
            "person.age = 25",
            "person.introduce() // Merhaba, ben Ali ve 25 yaşındayım."
        )
    ),
    Topic(
        id = 30,
        title = "Constructor ve Property",
        moduleId = 8,
        content = listOf(
            "Constructor: Sınıfın nesnesi oluşturulurken çağrılan özel bir fonksiyondur.",
            "Primary Constructor: Sınıf başlığında tanımlanır.",
            "Secondary Constructor: Sınıf içinde constructor anahtar kelimesi ile tanımlanır.",
            "Property: Sınıfa ait değişkenlerdir.",
            "Property Initialization: Özelliklerin ilk değerlerinin atanması.",
            "Custom Accessors (get/set): Özellikler için özel erişim metodları."
        ),
        examples = listOf(
            "// Primary Constructor",
            "class Person(val name: String, var age: Int) {",
            "    // Property Initialization Block",
            "    init {",
            "        println(\"Yeni bir Person nesnesi oluşturuldu.\")",
            "    }",
            "",
            "    // Secondary Constructor",
            "    constructor() : this(\"İsimsiz\", 0) {",
            "        println(\"İsimsiz kişi oluşturuldu.\")",
            "    }",
            "",
            "    // Custom Accessor",
            "    val isAdult: Boolean",
            "        get() = age >= 18",
            "}",
            "\nval person1 = Person(\"Ayşe\", 30)",
            "val person2 = Person() // İsimsiz kişi",
            "println(person1.isAdult) // true"
        )
    ),
    Topic(
        id = 31,
        title = "Kalıtım ve Arayüzler",
        moduleId = 8,
        content = listOf(
            "Kalıtım (Inheritance): Bir sınıfın özelliklerini başka bir sınıfa aktarma mekanizmasıdır.",
            "Kotlin'de varsayılan olarak sınıflar 'final'dır, kalıtım için 'open' anahtar kelimesi kullanılır.",
            "Arayüz (Interface): Sınıfların uygulaması gereken metodları tanımlayan sözleşmelerdir.",
            "Bir sınıf birden fazla arayüzü uygulayabilir, ancak yalnızca bir sınıftan türetilebilir.",
            "override: Üst sınıftaki veya arayüzdeki bir metodu yeniden tanımlamak için kullanılır."
        ),
        examples = listOf(
            "// Üst sınıf",
            "open class Animal(val name: String) {",
            "    open fun makeSound() {",
            "        println(\"Ses çıkarıyor...\")",
            "    }",
            "}",
            "\n// Alt sınıf",
            "class Dog(name: String) : Animal(name) {",
            "    override fun makeSound() {",
            "        println(\"Hav hav!\")",
            "    }",
            "}",
            "\n// Arayüz",
            "interface Swimmable {",
            "    fun swim()",
            "}",
            "\n// Hem kalıtım hem arayüz",
            "class Duck(name: String) : Animal(name), Swimmable {",
            "    override fun makeSound() {",
            "        println(\"Vak vak!\")",
            "    }",
            "    ",
            "    override fun swim() {",
            "        println(\"\$name yüzüyor.\")",
            "    }",
            "}"
        )
    ),
    Topic(
        id = 32,
        title = "Data Class ve Object",
        moduleId = 8,
        content = listOf(
            "Data Class: Veri depolamak için özel olarak tasarlanmış sınıflardır.",
            "equals(), hashCode(), toString() metodları otomatik olarak oluşturulur.",
            "copy() fonksiyonu ile kolayca kopyalar oluşturulabilir.",
            "Object: Tek örnekli (singleton) sınıfları tanımlamak için kullanılır.",
            "Companion Object: Statik metotlar ve özellikler için kullanılır."
        ),
        examples = listOf(
            "// Data Class",
            "data class User(val name: String, val age: Int)",
            "\nval user1 = User(\"Ahmet\", 25)",
            "val user2 = user1.copy(age = 30)",
            "println(user1) // User(name=Ahmet, age=25)",
            "println(user1 == User(\"Ahmet\", 25)) // true",
            "\n// Object (Singleton)",
            "object DatabaseConnection {",
            "    val url = \"jdbc:mysql://localhost:3306/db\"",
            "    fun connect() {",
            "        println(\"Veritabanına bağlanıyor...\")",
            "    }",
            "}",
            "\n// Companion Object",
            "class MathUtils {",
            "    companion object {",
            "        val PI = 3.14159",
            "        fun square(x: Int) = x * x",
            "    }",
            "}",
            "\nMathUtils.square(5) // 25",
            "println(MathUtils.PI) // 3.14159"
        )
    ),

    // Modül 9 - Fonksiyonel Programlama
    Topic(
        id = 33,
        title = "Lambda İfadeleri",
        moduleId = 9,
        content = listOf(
            "Lambda: İsimsiz fonksiyonlardır ve kod bloklarını değişkenlere atamak için kullanılır.",
            "Fonksiyonel programlama, fonksiyonları temel yapı taşları olarak kabul eder.",
            "Lambdalar diğer fonksiyonlara parametre olarak geçirilebilir veya değer olarak döndürülebilir."
        ),
        examples = listOf(
            "// Lambda ifadesi",
            "val sum: (Int, Int) -> Int = { a, b -> a + b }",
            "println(sum(3, 4)) // 7",
            "\n// Tekli lambda",
            "val square: (Int) -> Int = { it * it }",
            "println(square(5)) // 25",
            "\n// Parametresiz lambda",
            "val greet: () -> Unit = { println(\"Merhaba\") }",
            "greet() // Merhaba"
        )
    ),
    Topic(
        id = 34,
        title = "Higher-Order Fonksiyonlar",
        moduleId = 9,
        content = listOf(
            "Higher-Order Fonksiyon: Parametre olarak fonksiyon alan veya fonksiyon döndüren fonksiyonlardır.",
            "Bu tarz fonksiyonlar, kod tekrarını azaltmak ve daha soyut çözümler üretmek için kullanılır.",
            "filter, map, reduce gibi koleksiyon işlemleri Higher-Order fonksiyonlara örnektir."
        ),
        examples = listOf(
            "// Fonksiyon alan higher-order fonksiyon",
            "fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {",
            "    return operation(x, y)",
            "}",
            "\nval result1 = calculate(10, 5) { a, b -> a + b } // 15",
            "val result2 = calculate(10, 5) { a, b -> a * b } // 50",
            "\n// Fonksiyon döndüren higher-order fonksiyon",
            "fun createMultiplier(factor: Int): (Int) -> Int {",
            "    return { number -> number * factor }",
            "}",
            "\nval double = createMultiplier(2)",
            "val triple = createMultiplier(3)",
            "println(double(10)) // 20",
            "println(triple(10)) // 30"
        )
    ),
    Topic(
        id = 35,
        title = "Scope Fonksiyonları",
        moduleId = 9,
        content = listOf(
            "Scope fonksiyonları, nesneler üzerinde işlem yapmayı kolaylaştıran standart kütüphane fonksiyonlarıdır.",
            "let: Null olmayan nesneler üzerinde işlem yapmak ve sonuç döndürmek için kullanılır.",
            "with: Bir nesne üzerinde birden fazla işlem yapmak için kullanılır, receiver olarak 'this' kullanılır.",
            "run: 'with' ve 'let' kombinasyonu, nesne üzerinde işlemler yapar ve sonuç döndürür.",
            "apply: Nesne üzerinde işlem yapar ve nesnenin kendisini döndürür.",
            "also: Nesne üzerinde yan işlemler yapar ve nesnenin kendisini döndürür."
        ),
        examples = listOf(
            "// let",
            "val str: String? = \"Hello\"",
            "str?.let { println(it.uppercase()) } // HELLO",
            "\n// with",
            "val person = Person(\"Ali\", 25)",
            "val result = with(person) {",
            "    println(\"Name: \$name, Age: \$age\")",
            "    age * 2",
            "} // result = 50",
            "\n// run",
            "val result2 = person.run {",
            "    println(\"Name: \$name, Age: \$age\")",
            "    age * 2",
            "} // result2 = 50",
            "\n// apply",
            "val person2 = Person().apply {",
            "    name = \"Ayşe\"",
            "    age = 30",
            "} // person2 is Person(name=\"Ayşe\", age=30)",
            "\n// also",
            "val nums = mutableListOf(1, 2, 3)",
            "nums.also { println(\"Başlangıç liste: \$it\") }",
            "    .add(4) // Başlangıç liste: [1, 2, 3]"
        )
    ),

    // Modül 10 - Hata Yönetimi
    Topic(
        id = 36,
        title = "Exception Kavramı",
        moduleId = 10,
        content = listOf(
            "Exception (İstisna): Programın normal akışını bozan ve potansiyel olarak programın çökmesine neden olabilecek olaylardır.",
            "Kotlin'de Java'dakine benzer bir exception modeli kullanılır, ancak checked exceptions zorunlu değildir.",
            "Exceptions, runtime'da oluşur ve uygun şekilde yönetilmelidir."
        ),
        examples = listOf(
            "// Basit bir exception örneği",
            "fun divide(a: Int, b: Int): Int {",
            "    if (b == 0) {",
            "        throw ArithmeticException(\"Sıfıra bölme hatası\")",
            "    }",
            "    return a / b",
            "}",
            "\n// Bu çağrı exception fırlatacak",
            "// val result = divide(10, 0)"
        )
    ),
    Topic(
        id = 37,
        title = "Try-Catch-Finally",
        moduleId = 10,
        content = listOf(
            "try: Potansiyel olarak exception fırlatabilecek kodu içerir.",
            "catch: Oluşan exception'ı yakalar ve işler.",
            "finally: Exception oluşsa da oluşmasa da her zaman çalıştırılır.",
            "Kotlin'de try-catch bir ifade olarak kullanılabilir ve değer döndürebilir."
        ),
        examples = listOf(
            "// Temel try-catch",
            "try {",
            "    val result = 10 / 0",
            "    println(result)",
            "} catch (e: ArithmeticException) {",
            "    println(\"Hata: \${e.message}\")",
            "} finally {",
            "    println(\"Bu blok her zaman çalışır.\")",
            "}",
            "\n// İfade olarak try-catch",
            "val result = try {",
            "    10 / 2",
            "} catch (e: ArithmeticException) {",
            "    0 // Hata durumunda dönen değer",
            "}",
            "println(result) // 5"
        )
    ),
    Topic(
        id = 38,
        title = "Custom Exceptions",
        moduleId = 10,
        content = listOf(
            "Özel exception sınıfları, belirli hata türlerini daha iyi temsil etmek için tanımlanabilir.",
            "Exception sınıfından veya daha spesifik alt sınıflardan türetilebilir.",
            "Özel exceptionlar, kodun daha okunabilir ve bakımı kolay olmasını sağlar."
        ),
        examples = listOf(
            "// Özel exception sınıfı",
            "class InsufficientFundsException(val missing: Double) : ",
            "    Exception(\"Yetersiz bakiye: \$missing TL daha gerekiyor.\") {",
            "    fun getMissingAmount(): Double = missing",
            "}",
            "\n// Kullanım",
            "class BankAccount(var balance: Double) {",
            "    fun withdraw(amount: Double) {",
            "        if (amount > balance) {",
            "            throw InsufficientFundsException(amount - balance)",
            "        }",
            "        balance -= amount",
            "    }",
            "}",
            "\n// Örnek kullanım",
            "val account = BankAccount(100.0)",
            "try {",
            "    account.withdraw(150.0)",
            "} catch (e: InsufficientFundsException) {",
            "    println(e.message)",
            "    println(\"Eksik miktar: \${e.getMissingAmount()} TL\")",
            "}"
        )
    ),
    Topic(
        id = 39,
        title = "Result Sınıfı Kullanımı",
        moduleId = 10,
        content = listOf(
            "Result, Kotlin 1.3 ile tanıtılan ve hata yönetimini daha fonksiyonel bir yaklaşımla ele alan bir sınıftır.",
            "Success ve Failure alt sınıfları ile bir işlemin başarılı olup olmadığını temsil eder.",
            "Exception fırlatmak yerine bir sonuç nesnesi döndürmek daha güvenli olabilir."
        ),
        examples = listOf(
            "// Result kullanımı",
            "fun parseJson(json: String): Result<Map<String, Any>> {",
            "    return try {",
            "        val map = mapOf<String, Any>() // Gerçekte bir JSON parser kullanılır",
            "        Result.success(map)",
            "    } catch (e: Exception) {",
            "        Result.failure(e)",
            "    }",
            "}",
            "\n// Kullanım",
            "val result = parseJson(\"{\\\"name\\\": \\\"Ali\\\"}\")",
            "if (result.isSuccess) {",
            "    val data = result.getOrNull()",
            "    println(\"Veriler: \$data\")",
            "} else {",
            "    val error = result.exceptionOrNull()",
            "    println(\"Hata: \${error?.message}\")",
            "}"
        )
    )

)