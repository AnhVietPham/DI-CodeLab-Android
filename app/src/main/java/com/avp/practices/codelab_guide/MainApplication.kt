package com.avp.practices.codelab_guide

import android.app.Application
import com.avp.practices.codelab_guide.dagger_in_android_app.component.ApplicationComponent
import com.avp.practices.codelab_guide.dagger_in_android_app.component.DaggerApplicationComponent
import com.avp.practices.codelab_guide.dagger_in_android_app.module.NetWorkModule

class MainApplication : Application(){
    /**
     * This is manual DI
     * */
//    val appContainer = AppContainer()

    /**
     * This uses DaggerDI
     * */
    val appComponent: ApplicationComponent =  DaggerApplicationComponent.builder()
        .netWorkModule(
            NetWorkModule(
                "https://example.com.vn"
            )
        )
        .build()
}