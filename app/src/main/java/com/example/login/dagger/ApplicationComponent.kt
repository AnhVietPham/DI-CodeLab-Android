package com.example.login.dagger

import com.example.login.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetWorkModule::class])
interface ApplicationComponent {
    fun repository() : UserRepositoryDagger
    fun inject(activity: LoginActivity)
}