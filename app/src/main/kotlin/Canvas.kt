package com.app

class Canvas(
    val width: Int,
    val height: Int
) {

    private val colors = Array<Tuple>(width * height) { Black }

    private fun index(x: Number, y: Number): Int {
        val xi = x.toInt().coerceIn(0, width - 1)
        val yi = y.toInt().coerceIn(0, height - 1)
        return yi * width + xi
    }

    operator fun get(x: Number, y: Number): Tuple {
        return colors[index(x, y)]
    }

    operator fun set(x: Number, y: Number, color: Tuple) {
        colors[index(x, y)] = color
    }
}
