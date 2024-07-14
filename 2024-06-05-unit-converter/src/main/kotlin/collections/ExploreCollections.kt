package org.example.collections

fun main() {
    val names = mutableListOf("Alex", "Ben", "Chloe")
    names[0] = "312"
    println("Names: $names")
    val nameAgeMap = mutableMapOf("James" to 30, "Ben" to 20)
    println("Name to Age Map: $nameAgeMap")
    nameAgeMap["abc"] = 100
}