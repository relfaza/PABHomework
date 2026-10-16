package com.example.hw04.task3

fun String.wordCount(): Int {
    return this.split(Regex("\\s+"))
        .filter { it.isNotEmpty() }
        .size
}

fun Int.toRupiahString(): String {
    val sign = if (this < 0) "-" else ""
    val grouped = this.toString()
        .removePrefix("-")
        .reversed()
        .chunked(3)
        .joinToString(".")
        .reversed()
    return "Rp $sign$grouped"
}

fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val inRange = this.filter { it in min..max }
    return if (inRange.isEmpty()) 0.0 else inRange.average()
}

fun main() {
    val sentences = listOf(
        "Kotlin",
        "I am learning Kotlin",
        "Extension functions make code easier to read"
    )
    sentences.forEach { println("\"$it\" -> ${it.wordCount()} word(s)") }

    println()

    listOf(1000, 50000, 1000000).forEach { println(it.toRupiahString()) }

    println()

    val values = listOf(10, 50, 200, 85, -5)
    println("$values clampedAverage(0, 100) = ${values.clampedAverage(0, 100)}")
    println("Empty case: ${listOf(200, -1).clampedAverage(0, 100)}")
}