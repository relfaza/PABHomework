package com.example.hw04.task4

fun main() {
    val courses = mutableListOf("SIF101", "SIF202", "SIF303", "SIF202")
    val creditMap = mapOf("SIF101" to 3, "SIF202" to 4, "SIF303" to 3, "SIF404" to 2, "SIF505" to 3)

    println("Initial list: $courses")
    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF303")
    println("Final list: $courses")

    val uniqueCourses = courses.toSet()
    println("Unique courses: $uniqueCourses")

    val credits202 = creditMap["SIF202"] ?: 0
    val credits999 = creditMap.getOrDefault("SIF999", 0)
    println("SIF202 -> $credits202 credit hours")
    println("SIF999 -> $credits999 credit hours (not found, default used)")

    val totalCredits = uniqueCourses.sumOf { creditMap[it] ?: 0 }
    println("Total course entries in the list: ${courses.size}")
    println("Total enrolled courses (unique): ${uniqueCourses.size}")
    println("Total credit hours: $totalCredits")
}