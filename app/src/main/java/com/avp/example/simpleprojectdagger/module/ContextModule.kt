package com.avp.example.simpleprojectdagger.module

import android.content.Context
import com.avp.example.simpleprojectdagger.interfaces.ApplicationContext
import com.avp.example.simpleprojectdagger.interfaces.RandomUserApplicationScope
import dagger.Module
import dagger.Provides


@Module
class ContextModule(private val context : Context) {

    //@Named("application_context")
    @ApplicationContext
    @RandomUserApplicationScope
    @Provides
    fun context(): Context {
        return context.applicationContext
    }
}