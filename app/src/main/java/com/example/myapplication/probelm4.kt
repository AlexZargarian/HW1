package com.example.myapplication

fun problem4(number: Int): String {
    return when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
}

fun main() {
    val n1 = 12
    val n2 = -3444
    val n3 = 0

    val result1 = problem4(n1)
    val result2 = problem4(n2)
    val result3 = problem4(n3)

    println(result1)
    println( result2)
    println(result3)
}
