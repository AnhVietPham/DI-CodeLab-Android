package com.avp.example.simpleprojectdagger.Application

import android.app.Activity
import android.app.Application
import com.avp.example.simpleprojectdagger.component.DaggerUserComponent
import com.avp.example.simpleprojectdagger.component.UserComponent
import com.avp.example.simpleprojectdagger.module.ContextModule
import timber.log.Timber



class UserApplication : Application() {
    private lateinit var userApplicationComponent : UserComponent
     companion object {
         fun get(activity: Activity) : UserApplication{
             return activity.application as UserApplication
         }
     }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        userApplicationComponent = DaggerUserComponent.builder()
            .contextModule((ContextModule(this)))
            .build()
    }

    fun getUserApplicationComponent() : UserComponent{
        return userApplicationComponent
    }
}