@file:JvmName("StringFunctions")

package ch3

import java.lang.StringBuilder

fun <T> badJoinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

@JvmOverloads
fun <T> badJoinToStringWithDefaults(collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = get(length - 1)

@JvmOverloads
fun <T> Collection<T>.jointToString(separator: String = ", ", prefix: String = "", postfix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(separator: String = ", ", prefix: String = "", postfix: String = ""): String = joinToString(separator, prefix, postfix)
