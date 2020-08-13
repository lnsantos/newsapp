package com.pondero.newsapp.app.selectedCountry.adapters.states

import android.content.res.Resources
import androidx.viewpager2.widget.ViewPager2

interface SlideBuilderStateAdapter {

    fun setViewPager(viewPager2: ViewPager2) : SlideBuilderStateAdapter
    fun getViewPager() : ViewPager2

    fun setResource(resources: Resources) : SlideBuilderStateAdapter
    fun getResource() : Resources
}