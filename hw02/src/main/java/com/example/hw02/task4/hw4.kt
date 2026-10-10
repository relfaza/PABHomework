package com.example.hw02.task4

fun main() {
    // Part A
    val total = calculateStudyMinutes(3, 25)
    println("Total study time: $total minutes")
    // Call it again with 4 and 30.
    val total2 = calculateStudyMinutes(4,30)
    println("Total study time: $total2 minutes")

    println()

    // Part B
    for (courses in 1..5 ) {
        val total = calculateTotalCredits(courses, 3)
        println("Courses: $courses, total credits: $total")
    }
}

fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int {
    return sessions * minutesPerSession
}

fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int {
    return courses * creditsPerCourse
}
