package com.pondero.newsapp.app.animation

import android.view.animation.Interpolator
import java.lang.Math.*
import kotlin.math.cos
import kotlin.math.pow

class BounceInterpolator() : Interpolator{

    private var amplitude : Double = 1.0
    private var frequency : Double = 10.0

    constructor(
        amplitude:Double,
        frequency:Double) : this() {
        this.amplitude = amplitude
        this.frequency = frequency
    }

    override fun getInterpolation(input: Float): Float = run {
        val calculatePow = E.pow(((-input / amplitude)))
        val calculateCos = cos(frequency * input)
        val calculateRes = -1 * (calculatePow * calculateCos)
        (calculateRes + 1).toFloat()
    }

}