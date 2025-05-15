package org.example

fun main() {
    val user1 = User("Kirill", 23)
    val user2 = User("Olga", 35)

    println(user1.name)
    println(user1.age)
    //println(user2)

    val maxAgeUser = getMaxAgeUser(user1, user2)

    println("Пользователь ${maxAgeUser.name} старше. Его возраст: ${maxAgeUser.age}")
}

fun getMaxAgeUser(user1: User, user2: User): User {
    val maxAgeUser: User = if (user1.age > user2.age)
        user1
    else
        user2
    return maxAgeUser
}

data class User(val name: String, val age: Int)