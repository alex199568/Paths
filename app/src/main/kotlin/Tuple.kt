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

    operator fun plus(other: Tuple): Tuple {
        return Tuple(x + other.x, y + other.y, z + other.z, w + other.w)
    }

    operator fun minus(other: Tuple): Tuple {
        return Tuple(x - other.x, y - other.y, z - other.z, w - other.w)
    }

    operator fun times(n: Number): Tuple {
        val d = n.toDouble()
        return Tuple(x * d, y * d, z * d, w * d)
    }

    operator fun div(n: Number): Tuple {
        val d = n.toDouble()
        return Tuple(x / d, y / d, z / d, w / d)
    }

    operator fun unaryMinus(): Tuple {
        return Tuple(-x, -y, -z, -w)
    }
}
