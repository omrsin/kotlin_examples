package ch3

import ch3.os.parseFile

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 3, 7)
    val list = arrayListOf(1, 7, 3, 7)
    val map = hashMapOf(1 to "one", 5 to "five", 7 to "seven", 1 to "one")
    val stringSet = hashSetOf("one", "two", "three")

    println(set)
    println(list)
    println(map)

    println(list.last())
    println(set.max())

    println(badJoinToString(list, "; ", "(", ")"))
    println(badJoinToString(set, separator = " ", postfix = "]", prefix = "["))

    println(badJoinToStringWithDefaults(set))

    println("Strings".lastChar())

    println(list.jointToString(separator = "; "))
    println(stringSet.join())

    println(multiple("a", "b", "c", "d"))
    val elems = arrayOf("A", "B", "C", "D")
    println(multiple(*elems))

    val file = parseFile("/home/omar/.oh-my-zsh/plugins/git/git.plugin.zsh")
    file.innerTest()

    println(file)
}

fun multiple(vararg elems: String): String = elems.joinToString("; ")