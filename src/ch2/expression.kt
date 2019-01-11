package ch2

import kotlin.IllegalArgumentException

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun badEval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        val s = e as Sum
        return badEval(s.left) + badEval(s.right)
    }
    throw IllegalArgumentException("Unknown Expression")
}

fun notSoBadEval(e: Expr): Int =
        if (e is Num)
            e.value
        else if (e is Sum)
            notSoBadEval(e.left) + notSoBadEval(e.right)
        else
            throw IllegalArgumentException("Unknown Expression")

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("Unknown Expression")
        }


fun main(args: Array<String>) {
    val e = Sum(Sum(Num(2), Num(1)), Num(4))
    println(badEval(e))
    println(notSoBadEval(e))
    println(eval(e))

}