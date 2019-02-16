package com.example.admin.simpleprojectdagger.module

import android.content.Context
import com.example.admin.simpleprojectdagger.interfaces.RandomUserApplicationScope
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