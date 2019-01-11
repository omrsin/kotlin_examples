package ch2

class Person(val name: String, val gender: String) {
    val title: String get() = if (gender == "M") "Mr." else if (gender == "F") "Mrs." else ""
}
