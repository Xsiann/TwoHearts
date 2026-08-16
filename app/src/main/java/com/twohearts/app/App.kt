package com.twohearts.app

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize singletons, logging, analytics toggles (none for V1 offline-first)
    }
}
