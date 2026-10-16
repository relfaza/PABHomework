# PABHomework

Kotlin homework for the **Mobile Application Development (Pengembangan Aplikasi Bergerak, SIF502)**
course, Odd Semester 2026/2027, Universitas Islam Indonesia.

Each homework is a separate Gradle module. Each task is its own package with a single file
that has its own `main()` function, so every task can be run on its own.

## Modules

| Module | Meeting | Topic | Tasks |
|---|---|---|---|
| `hw02` | 2 | Kotlin Programming Essentials | Variables and string templates, `if` and `when`, loops with ranges and `step`, functions, reading input with `readln()` |
| `hw03` | 3 | OOP in Kotlin and Null Safety | Inheritance with `open` and `override`, null safety (`?.`, `?:`, `?.let`), smart cast with `is`, abstract class and interfaces |
| `hw04` | 4 | Kotlin-Specific Features and Collections | `data class`, `enum class`, extension functions, `List`, `Set`, `Map`, destructuring |
| `hw05` | 5 | Functional and Idiomatic Kotlin | Lambdas, higher-order functions, collection pipelines, scope functions |

## Task overview

### hw02: Kotlin Programming Essentials
1. Student profile with `val`, `var`, and string templates
2. Deadline status with `if` / `else if` / `else` and month names with `when`
3. Study schedule with `for`, ranges, and `step`
4. Study time and credit calculation with functions
5. Average score with `readln()`, `Double`, and `if` as an expression

### hw03: OOP in Kotlin and Null Safety
1. `SmartDevice` and `SmartLightDevice` (`open`, `override`, `super`)
2. `SmartTvDevice` with a custom setter and `private set`
3. Null safety with `String?`, `?.`, `?:`, and `?.let`
4. Smart cast with `is` inside `when`
5. `SmartWatch` with an abstract class, two interfaces, and a nullable property

### hw04: Kotlin-Specific Features and Collections
1. `Book` data class with `toString()`, `copy()`, and `==`
2. `SubmissionStatus` enum with a property and `when`
3. Extension functions: `wordCount()`, `toRupiahString()`, `clampedAverage()`
4. `MutableList`, `Set`, and `Map` with a course registration scenario
5. Student grade book with `LetterGrade`, an extension function, and destructuring

### hw05: Functional and Idiomatic Kotlin
1. Lambdas and function types
2. Higher-order functions: `applyTwice`, `printIf`, and a generic `transform`
3. Collection pipelines with `filter`, `map`, `sortedByDescending`, `fold`, and `groupBy`
4. Scope functions: `apply`, `let`, and `also`
5. Grade report with `partition`, `maxByOrNull`, `minByOrNull`, and `buildString`

## Project structure

```
PABHomework/
├── hw02/src/main/java/com/example/hw02/task1 ... task5/hw1.kt ... hw5.kt
├── hw03/src/main/java/com/example/hw03/task1 ... task5/hw1.kt ... hw5.kt
├── hw04/src/main/java/com/example/hw04/task1 ... task5/hw1.kt ... hw5.kt
└── hw05/src/main/java/com/example/hw05/task1 ... task5/hw1.kt ... hw5.kt
```

## How to run

1. Clone this repository and open it in Android Studio.
2. Wait for the Gradle sync to finish.
3. Open any task file, for example `hw04/.../task1/hw1.kt`.
4. Click the green **▶** icon next to `fun main()` and choose **Run**.
5. For `hw02` task 5, which reads keyboard input, click inside the Run window and type
   the values there.

## Other homework repositories

| Homework | Repository |
|---|---|
| Homework 6: My First Compose App | [MyFirstComposeApp](https://github.com/relfaza/MyFirstComposeApp) |
| Shalatku (Jetpack Compose app) | [Shalatku](https://github.com/relfaza/Shalatku) |

## Tech stack

- Kotlin
- Android Studio
- Gradle (Kotlin DSL)

## Author

Farrel Faza