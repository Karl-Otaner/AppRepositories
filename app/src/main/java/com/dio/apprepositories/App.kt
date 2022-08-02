package com.dio.apprepositories

import android.app.Application
import com.dio.apprepositories.data.di.DataModule
import com.dio.apprepositories.domain.di.DomainModule
import com.dio.apprepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}