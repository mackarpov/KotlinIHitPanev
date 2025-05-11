package org.example

fun main() {
    val number1: Int = 12
    val number2: Int = 23
    val number3: Int = 8

    if (number1 > number2 && number1 > number3)
        println(number1)
    else if (number2 > number1 && number2 > number3)
        println(number2)
    else
        println(number3)

    val rating: Int = 1
    // 2 - плохо
    // 1 - плохо
    // 3 - нормально
    // 4 - хорошо
    // 5 - отлично

    val condition1: Boolean = rating ==1 || rating == 2

    if (rating == 1 || rating == 2)
        println("Плохо")
    else if (rating == 3)
        println("Нормально")
    else if (rating == 4)
        println("Хорошо")
    else if (rating == 5)
        println("Отлично")

    when (rating) {
        1, 2 -> println("Плохо")
        3 -> println("Нормально")
        4 -> println("Хорошо")
        5 -> println("Отлично")
    }

    // Более сложные условия
    when {
        rating == 1 || rating == 2 -> println("Плохо")
        rating == 3 -> println("Нормально")
        rating == 4 -> println("Хорошо")
        rating == 5 -> println("Отлично")
    }
}
