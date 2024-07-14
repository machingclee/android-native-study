package org.example.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
) {
}

fun main() {
    val course1 = Course(
        1,
        "function analysis",
        "James Lee"
    )

    val course2 = Course(
        1,
        "function analysis",
        "James Lee"
    )

    println(course1 == course2)
}