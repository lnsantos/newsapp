package com.pondero.newsapp.app.selectedCountry.adapters

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.pondero.newsapp.R
import com.pondero.newsapp.databinding.FragmentCardCountryBinding

class SlideViewPagerAdapter()
    : RecyclerView.Adapter<SlideViewPagerAdapter.ViewPagerViewHolder>() {

    private var countries = arrayListOf<Int>()

    init {
        startCountries()
    }

    fun startCountries(){
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
        holder.bindView(countries[position])
    }

    class ViewPagerViewHolder(private val binding: FragmentCardCountryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindView(country: Int){
            binding.imageCountry.setImageResource(country)
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