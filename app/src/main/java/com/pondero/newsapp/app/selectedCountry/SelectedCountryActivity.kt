package com.pondero.newsapp.app.selectedCountry

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.pondero.newsapp.R
import com.pondero.newsapp.app.selectedCountry.adapters.SlideViewPagerAdapter
import com.pondero.newsapp.databinding.ActivitySelectedCountryBinding

class SelectedCountryActivity : AppCompatActivity(){

    private lateinit var binding : ActivitySelectedCountryBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setupView()
    }

    private fun setupView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_selected_country)

        with(binding.pagerCountry){
            adapter = SlideViewPagerAdapter()
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
            getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        }

    }

}