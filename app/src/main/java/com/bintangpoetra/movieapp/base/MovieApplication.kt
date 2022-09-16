package com.bintangpoetra.movieapp.base

import android.app.Application
import com.bintangpoetra.movieapp.di.feature.movieModule
import com.bintangpoetra.movieapp.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level.NONE

class MovieApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(NONE)
            androidContext(this@MovieApplication)
            modules(
                listOf(
                    networkModule,
                    movieModule
                )
            )
        }
    }
}