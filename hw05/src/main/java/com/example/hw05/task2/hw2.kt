package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    val first = operation(n)
    return operation(first)
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map(mapper)
}

fun main() {
    val double: (Int) -> Int = { it * 2 }
    val startsWithVowel: (String) -> Boolean = {
        it.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }

    // 1. applyTwice
    println(applyTwice(3, double))

    // 2. printIf
    val courses = listOf(
        "Mobile Application Development",
        "Game Development",
        "Information and Cyber Security",
        "Arabic for the Quran",
        "Islam as a Mercy to the Worlds"
    )
    printIf(courses, startsWithVowel)

    // 3. transform
    val squares = transform(listOf(2, 3, 4)) { (it * it).toString() }
    println(squares)
}