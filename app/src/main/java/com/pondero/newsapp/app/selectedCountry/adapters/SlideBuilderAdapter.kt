package com.pondero.newsapp.app.selectedCountry.adapters

import android.content.res.Resources
import androidx.viewpager2.widget.ViewPager2
import com.pondero.newsapp.app.selectedCountry.adapters.states.SlideBuilderStateAdapter

class SlideBuilderAdapter : SlideBuilderStateAdapter{

    private lateinit var viewPager2: ViewPager2
    private lateinit var resources: Resources

    override fun setViewPager(viewPager2: ViewPager2): SlideBuilderStateAdapter = run {
        this@SlideBuilderAdapter.viewPager2 = viewPager2
        this@SlideBuilderAdapter
    }

    override fun getViewPager(): ViewPager2 = viewPager2

    override fun setResource(resources: Resources): SlideBuilderStateAdapter = run {
        this@SlideBuilderAdapter.resources = resources
        this@SlideBuilderAdapter
    }

    override fun getResource(): Resources = resources
}