package org.example

fun main() {

    var a: Int = 10
    a = a + 5 // 15
    a += 5 // 20
    a -= 5 // 15
    a *= 5 // 75
    a /= 15 // 5
    println(a)

    var text: String = "hello"
    var textLength: Int = text.length
    println(textLength)

    val letter = text[2] // Char l - index = 2
    println(letter)

    val name: String = "Dmitry"
    val age: Int = 27
    val document: String = "Passport"

    // Пассажир: Дмитрий, возраст: 27, тип документа: Паспорт
    println("Пассажир: $name, возраст: $age, тип документа: $document")
}