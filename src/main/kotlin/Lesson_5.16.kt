package org.example

fun main() {
    val email: String = "karpov2713@gmail.com"
    val result = emailIsCorrect(email)
    println(result)
}

fun emailIsCorrect(email: String): Boolean{
    return (email.contains('@') && email.contains('.'))
}

fun emailIsNotCorrect(email: String): Boolean{
    val result = !emailIsCorrect(email)

    return result
}