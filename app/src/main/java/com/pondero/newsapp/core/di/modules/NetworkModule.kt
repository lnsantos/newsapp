package com.pondero.newsapp.core.di.modules

import com.pondero.newsapp.BuildConfig
import com.pondero.newsapp.core.annotations.AuthInterceptorOkHttpClient
import com.pondero.newsapp.core.network.ApiService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

/**
 *  implementation not complete...
 * **/
@Module
@InstallIn(ActivityComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideApiServiceInstance( @AuthInterceptorOkHttpClient okHttpClient: OkHttpClient ) : ApiService = run {
        Retrofit.Builder()
            .baseUrl(BuildConfig.BUILD_NEWS_API_URL)
            .client(okHttpClient)
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @AuthInterceptorOkHttpClient
    fun providerOkHttpClient() : OkHttpClient = run {
        OkHttpClient.Builder()
            .build()
    }

}