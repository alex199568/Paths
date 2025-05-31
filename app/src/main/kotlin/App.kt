package com.app

fun vector(x: Number, y: Number, z: Number): Tuple {
    return Tuple(x, y, z, 0)
}

fun point(x: Number, y: Number, z: Number): Tuple {
    return Tuple(x, y, z, 1)
}

fun main() {
    println(vector(1, 2, 3) + point(2, 3, 4))
}
