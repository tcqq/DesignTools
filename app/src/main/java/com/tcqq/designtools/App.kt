package com.tcqq.designtools

import android.app.Application
import timber.log.Timber

/**
 * @author Perry Lance
 * @since 07/09/2018 Created
 */
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}