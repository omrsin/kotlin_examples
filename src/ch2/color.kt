package ch2

enum class Color {
    RED, BLUE, GREEN, YELLOW, PURPLE, PINK, BLACK, WHITE
}

enum class RGBColor (val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}