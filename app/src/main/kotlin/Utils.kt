package com.app

fun vector(x: Number, y: Number, z: Number): Tuple {
    return Tuple(x, y, z, 0)
}

fun point(x: Number, y: Number, z: Number): Tuple {
    return Tuple(x, y, z, 1)
}