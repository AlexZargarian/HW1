package com.example.myapplication

fun main() {

    val numbers = listOf(4,11,12,14,16,123,22,43,44,46,76,0)


    val evenNumbers = numbers.filter { it % 2 == 0 }

    println("Even Numbers:")
    evenNumbers.forEach { println(it) }
}
