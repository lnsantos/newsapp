package com.pondero.newsapp.core.network

import com.pondero.newsapp.BuildConfig
import retrofit2.http.GET

interface ApiService {

    @GET(BuildConfig.ROUTER_ALL_NEWS)
    fun searchNews()

}