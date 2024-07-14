package org.example.classes

open class Person(
    val name: String,
    val color: Color,
) {
    open var isLoggedIn: Boolean = false
    var age: Double = 0.00
        get() {
            return field
        }
        set(value) {
            if (value >= 0.0) {
                field = value
            } else {
                throw Exception("invalid value")
            }
        }

    companion object {
        fun walk() {
            println("Walking")
        }
    }

    open fun action() {
        println("YO YO!")
    }
}

enum class Color {
    WHITE,
    BLACK
}

fun printName(name: String?) {
    if (name == null) {
        return println("name is null")
    }
    println(name)
}

fun main() {
    // val person = Person("James", Color.BLACK)
    // // person.age = -5.0
    // Person.walk()
    // println(person.color)
    // println(Color.WHITE.toString() === "WHITE")
    val nullableStr: String? = null

    printName(nullableStr)
}