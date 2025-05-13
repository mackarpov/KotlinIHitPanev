package org.example

fun main() {
    // ввод данных
    val a: Int = 23 // main.a
    val b: Int = 10 // main.b

    // нахождение максимального числа
//    val maxNumber: Int = if (a > b)
//        a
//    else
//        b
    val maxNumber: Int = getMaxNumber(a, b) // main.maxNumber

    // вывод данных в консоль
    println(maxNumber)
}

fun getMaxNumber(firstNumber: Int, secondNumber: Int): Int {
    val result = if (firstNumber > secondNumber)
        firstNumber
    else
        secondNumber
    return result
}