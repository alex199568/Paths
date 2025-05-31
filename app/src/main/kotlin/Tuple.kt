package com.app

import kotlin.math.sqrt

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

    infix fun dot(other: Tuple): Double {
        return x * other.x + y * other.y + z * other.z + w * other.w
    }

    infix fun cross(other: Tuple): Tuple {
        return vector(
            y * other.z - z * other.y,
            z * other.x - x * other.z,
            x * other.y - y * other.x
        )
    }

    val squaredLength by lazy {
        this dot this
    }

    val length by lazy {
        sqrt(squaredLength)
    }

    val unit by lazy {
        this / length
    }
}
