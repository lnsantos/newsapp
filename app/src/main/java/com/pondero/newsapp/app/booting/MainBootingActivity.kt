package com.pondero.newsapp.app.booting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.pondero.newsapp.R

class MainBootingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_booting)
    }

    @SuppressLint("ResourceType")
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