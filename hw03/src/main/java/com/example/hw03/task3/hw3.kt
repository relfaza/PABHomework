package com.example.hw03.task3

fun main() {
    // var studentName: String? = null
    var studentName: String? = "Ayu"
    var length = studentName?.length

    println("Length: $length")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let { println("Hello, $it!") }

}
