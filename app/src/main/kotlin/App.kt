package com.app


fun main() {
    val image = Canvas(640, 480)

    for (y in 0 until image.height) {
        for (x in 0 until image.width) {
            image[x, y] = color(x.toDouble() / image.width.toDouble(), y.toDouble() / image.height.toDouble(), 0.5)
        }
    }
}
