package com.pondero.newsapp.app.booting.selected_country.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.pondero.newsapp.R
import com.pondero.newsapp.databinding.ActivitySelectedCountryBinding

class BannerCountryFragment : FragmentActivity(){

    private lateinit var binding : ActivitySelectedCountryBinding

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_selected_country)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setupView()
    }

    @SuppressLint("ResourceType")
    private fun setupView() {

        with(binding.pager){
            adapter =
                com.pondero.newsapp.app.booting.selected_country.adapters.SlideViewPagerAdapter()
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
            getChildAt(0).overScrollMode = androidx.recyclerview.widget.RecyclerView.OVER_SCROLL_NEVER
            setPageTransformer(com.pondero.newsapp.core.ui.animations.AnimationCompositePageTransformer.sendAnimation())
        }

    }


}