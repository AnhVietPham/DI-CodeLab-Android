package com.avp.example.simpleprojectdagger.module

import android.content.Context
import com.avp.example.simpleprojectdagger.interfaces.RandomUserApplicationScope
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