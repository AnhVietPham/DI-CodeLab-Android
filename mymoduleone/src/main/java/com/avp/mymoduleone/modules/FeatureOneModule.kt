package com.avp.mymoduleone.modules

import com.avp.mymoduleone.objects.AnyObject
import dagger.Module
import dagger.Provides

@Module
class FeatureOneModule {
    @Provides
    fun provideFeatureOne() = AnyObject()
}