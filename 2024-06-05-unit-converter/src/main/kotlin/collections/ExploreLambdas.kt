package org.example.collections

fun calculate(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}


data class Course(
    val id: Int,
    var name: String,
    val author: String,
) {}

fun main() {
    // val addLambda = { x: Int -> x + x }
    // val result = addLambda(3)
    // println("result: $result")
    //
    // val multiply = { x: Int, y: Int ->
    //     println("Multiplying $x to $y")
    //     x * y
    // }
    // println("Multiplied result: ${calculate(2, 22) { a, b -> a * b }}")
    //
    // val numList = listOf(1, 2, 3, 4, 5, 6)
    // val finding = numList.find { x -> x == 5 }
    // val result2 = numList.filter { x -> x >= 5 }
    // println("finding Result: $finding")
    val course = Course(1, "Functional Analysi", "Kin Y Li")
    course.apply {
        name = "Functional Analysis"
    }
    println("The course: $course")
}