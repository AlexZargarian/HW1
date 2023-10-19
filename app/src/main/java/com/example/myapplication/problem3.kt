package com.example.myapplication

fun probelm3(keyValueMap: Map<String, Int>) {
    for ((key, value) in keyValueMap) {
        println("Key: $key, Value: $value")
    }
}

fun main() {

    val keyValueMap = mapOf(
        "c" to 3,
        "e" to 5,
        "b" to 2,
        "d" to 4,
        "a" to 1
    )


    probelm3(keyValueMap)
}
