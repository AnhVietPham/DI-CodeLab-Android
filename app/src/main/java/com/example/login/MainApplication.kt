package com.example.login

import android.app.Application
import com.example.login.dagger.ApplicationComponent
import com.example.login.dagger.DaggerApplicationComponent
import com.example.login.dagger.NetWorkModule

class MainApplication : Application(){
    /**
     * This is manual DI
     * */
//    val appContainer = AppContainer()

    /**
     * This uses DaggerDI
     * */
    val appComponent: ApplicationComponent =  DaggerApplicationComponent.builder()
        .netWorkModule(NetWorkModule("https://example.com.vn"))
        .build()
}