package com.avp.practices.codelab.dagger_in_android_app

import com.avp.practices.codelab.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetWorkModule::class])
interface ApplicationComponent {
    fun repository() : UserRepositoryDagger
    fun inject(activity: LoginActivity)
}