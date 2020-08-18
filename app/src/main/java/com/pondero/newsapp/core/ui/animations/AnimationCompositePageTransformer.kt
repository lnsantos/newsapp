package com.pondero.newsapp.core.ui.animations

import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import kotlin.math.abs

object AnimationCompositePageTransformer {

    fun sendAnimation() : CompositePageTransformer = run {
        CompositePageTransformer().apply {
            addTransformer(marginPageConfig)
            addTransformer { page, position ->
                val right = 1 - abs(position)
                page.scaleY = ((0.70 + right * 0.30f).toFloat())
            }
        }
    }

    private val marginPageConfig = MarginPageTransformer(40)
}