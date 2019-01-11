package ch3.os

data class File(val path: String, val directory: String, val fullName: String, val fileName: String, val extension: String) {
    fun innerTest() {
        println("Inner test")
    }
}

fun File.test() {
    println("I was called")
}

fun parseFile(path: String): File {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val filename = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    val f = File(path, directory, fullName, filename, extension)
    f.test()
    return f
}