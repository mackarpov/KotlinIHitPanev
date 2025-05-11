package org.example

fun main() {

    // Ввод данных
    val a: Int = 10 // Инициализация переменных
    val b: Int = 5 // Инициализация переменных

    val c: Int = readLine()!!.toInt() // Ввод данных через консоль
    val d: Int = readLine()!!.toInt() // Ввод данных через консоль

    // Обработка данных
    val sum: Int = a + b
    val sum2: Int = c + d

    // Вывод данных
    println("$sum, $sum2")

}