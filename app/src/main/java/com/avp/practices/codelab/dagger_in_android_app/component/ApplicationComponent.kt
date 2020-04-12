package com.avp.practices.codelab.dagger_in_android_app.component

import com.avp.practices.codelab.dagger_in_android_app.module.NetWorkModule
import com.avp.practices.codelab.dagger_in_android_app.module.SubComponentsModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetWorkModule::class, SubComponentsModule::class])
interface ApplicationComponent {
    fun loginComponent(): LoginComponent.Factory
}