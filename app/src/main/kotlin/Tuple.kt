package com.app

data class Tuple(
    val x: Double = 0.0,
    val y: Double = 0.0,
    val z: Double = 0.0,
    val w: Double = 0.0
) {

    constructor(x: Number, y: Number, z: Number, w: Number) : this(
        x.toDouble(),
        y.toDouble(),
        z.toDouble(),
        w.toDouble()
    )
}
