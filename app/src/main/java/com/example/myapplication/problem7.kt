package com.example.myapplication

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    val current = LocalDateTime.now()


    val format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")


    val proper = current.format(format)


    println(proper)
}
