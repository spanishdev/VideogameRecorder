package com.radioactivewasp.videogamerecords

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.HasAndroidInjector

class App: Application(), HasAndroidInjector {
    override fun androidInjector(): AndroidInjector<Any> {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        super.onCreate()

    }

}