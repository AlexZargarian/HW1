package com.example.myapplication


    class Person(val name: String, val age: Int, val gender: String)

    fun main() {
        // Create an object of the Person class
        val person = Person("Alex Zargarian", 22, "Male")

        // Access and print the properties of the person object
        println("Person's Name is : ${person.name}")
        println("Person's Age is : ${person.age}")
        println("Person's gender is: ${person.gender} ")
    }

