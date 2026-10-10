package com.example.hw05.task1

fun main() {
    val double: (Int) -> Int = { it * 2 }
    println(double(7))

    val startsWithVowel: (String) -> Boolean = {  it.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u') }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    val larger: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(larger(12, 7))
}