package org.example

fun main() {
    val weekSales: List<Int> = mutableListOf(45, 87, 4, 216, 1)



//    weekSales.add(89)
//    weekSales.remove(4)
//    weekSales.removeAt(1)
//    println(weekSales)

//    println(numbers[0]) // 45
//    println(numbers[1]) // 87

    var counter = 0
    for (sale in weekSales) {
        if (sale > 10)
            counter++
    }
    println(counter)
}