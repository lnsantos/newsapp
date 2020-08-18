package com.pondero.newsapp.app.booting.selected_country.adapters

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.pondero.newsapp.R
import com.pondero.newsapp.app.animation.BounceInterpolator
import com.pondero.newsapp.databinding.FragmentCardCountryBinding

class SlideViewPagerAdapter()
    : RecyclerView.Adapter<SlideViewPagerAdapter.ViewPagerViewHolder>() {

    private var countries = arrayListOf<Int>()
    private var nameCountries = arrayListOf("BR","EUA")

    init {
        startCountries()
    }

    private fun startCountries(){
        countries.add(R.drawable.br)
        countries.add(R.drawable.ic_us)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder = run {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = FragmentCardCountryBinding.inflate(layoutInflater,parent,false)
        ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int = countries.size

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.bindView(countries[position],nameCountries[position])
    }

    class ViewPagerViewHolder(private val binding: FragmentCardCountryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(country: Int,name:String){
            binding.imageCountry.setImageResource(country)
            binding.nameCountry.text = name
            binding.root.setOnClickListener{
                animationView(binding)
            }
        }

        private fun animationView(view: FragmentCardCountryBinding){
            val interpolatorAnimationBounce = BounceInterpolator(0.2,20.0)
            val animation = AnimationUtils.loadAnimation(view.root.context,R.anim.bounce)
            animation.interpolator = interpolatorAnimationBounce
            animation.duration = 2000
            view.root.startAnimation(animation)
        }

    }

    class Builder{

        private val builderState = SlideBuilderAdapter()

        fun setViewPager(viewPager: ViewPager2) : Builder = run {
            builderState.setViewPager(viewPager)
            this@Builder
        }

        fun setResource(resources: Resources) : Builder = run {
            builderState.setResource(resources)
            this@Builder
        }

        fun build() = SlideViewPagerAdapter()

    }

    companion object{

        @JvmStatic
        val TAG = this::class.java.simpleName.toString()
    }

}