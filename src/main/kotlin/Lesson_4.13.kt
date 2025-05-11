package org.example

// Debugger. Отладка приложений
fun main() {
    val passengerAge: Int = 18

    val document = if (passengerAge > 14)
        "паспорт"
    else
        "свидетельство о рождении"

    println(document)
}