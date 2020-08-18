package com.pondero.newsapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.pondero.newsapp.app.booting.selected_country.adapters.SlideViewPagerAdapter
import com.pondero.newsapp.core.ui.animations.AnimationCompositePageTransformer
import com.pondero.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupView()
    }

    private fun setupView() {
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        with(binding.pager){
            adapter = SlideViewPagerAdapter()
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
            getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
            setPageTransformer(AnimationCompositePageTransformer.sendAnimation())
        }
    }

}