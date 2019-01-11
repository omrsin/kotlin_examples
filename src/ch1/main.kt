package ch1

import ch3.lastChar as last

data class People(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf<People>(
        People("Alice"),
        People("Bob", 32),
        People("Valeria", 29),
        People("Amelia", 58)
    )
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")

    println("hello".last())
}