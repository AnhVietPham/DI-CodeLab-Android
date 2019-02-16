package com.example.admin.simpleproject.module

import android.content.Context
import com.example.admin.simpleproject.interfaces.RandomUserApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ActivityModule(private val context: Context) {

    @Named("activity_context")
    @RandomUserApplicationScope
    @Provides
    fun context() : Context{
        return context
    }
}