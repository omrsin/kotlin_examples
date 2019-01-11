package ch2

import ch2.RGBColor.*

fun max(a: Int, b: Int) = if (a > b) a else b

fun getName(color: RGBColor) =
        when (color) {
            RED -> "Red"
            BLUE -> "Blue"
            GREEN -> "Green"
        }

fun mix(c1: RGBColor, c2: RGBColor) =
        when (setOf(c1, c2)) {
            setOf(RED, BLUE) -> "Purple"
            setOf(RED, GREEN) -> "Brown"
            setOf(BLUE, GREEN) -> "Yellow"
            else -> "Dirty"
        }

fun main(args: Array<String>) {
    println("Hello, ${if (args.isNotEmpty()) args[0] else "Kotlin"}")
    val a = 3
    val b = 5
    println("The ch2.max between $a and $b is: ${max(a, b)}")

    val person = Person("Omar Erminy", "M")
    println("Name: ${person.title} ${person.name}")

//    val question = "The Ultimate Question of Life, the Universe, and Everything"
//    val answer =  42

    println(RGBColor.BLUE.rgb())
    println(RGBColor.RED.rgb())
    println("The color ${getName(GREEN)} has a number of ${RGBColor.GREEN.rgb()}")
    println("Mixing ${getName(BLUE)} and ${getName(GREEN)} yields ${mix(GREEN, BLUE)}")
}
