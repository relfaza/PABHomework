package com.example.hw02.task2

fun main() {
    // Part A
    // val daysRemaining = 2
    // val daysRemaining = 0
    val daysRemaining = -1

    // Use if, else if, and else.
    if (daysRemaining < 0) {
        println("Overdue")
    } else if (daysRemaining == 0) {
        println("Due today")
    } else {
        println("Upcoming")
    }

    // Part B
    // val month = 9
    val month = 13

    val monthName = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }

    println("Month $month: $monthName")
}
