package com.radioactivewasp.videogamerecords.di

import com.radioactivewasp.videogamerecords.BuildConfig
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AppModule {

    @Provides
    fun provideRetrofit() = Retrofit.Builder().baseUrl(BuildConfig.API_HOST).build()
}