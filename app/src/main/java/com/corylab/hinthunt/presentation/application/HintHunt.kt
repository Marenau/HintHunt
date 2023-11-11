package com.corylab.hinthunt.presentation.application

import android.app.Application
import android.content.Context

class HintHunt : Application() {

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
        lateinit var context: Context
            private set
    }
}