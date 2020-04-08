package com.avp.practices.codelab

import android.app.Application
import com.avp.practices.codelab.dagger.ApplicationComponent
import com.avp.practices.codelab.dagger.DaggerApplicationComponent
import com.avp.practices.codelab.dagger.NetWorkModule

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