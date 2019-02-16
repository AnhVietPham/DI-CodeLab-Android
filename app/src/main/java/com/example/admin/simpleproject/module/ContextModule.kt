package com.example.admin.simpleproject.module

import android.content.Context
import com.example.admin.simpleproject.interfaces.ApplicationContext
import com.example.admin.simpleproject.interfaces.RandomUserApplicationScope
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