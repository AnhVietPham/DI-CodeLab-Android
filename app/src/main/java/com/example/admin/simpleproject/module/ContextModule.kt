package com.example.admin.simpleproject.module

import android.content.Context
import com.example.admin.simpleproject.interfaces.RandomUserApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class ContextModule(private val context : Context) {

    @Named("application_context")
    @RandomUserApplicationScope
    @Provides
    fun context(): Context {
        return context.applicationContext
    }
}