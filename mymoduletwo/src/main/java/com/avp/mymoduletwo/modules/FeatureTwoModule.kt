package com.avp.mymoduletwo.modules

import com.avp.mymoduletwo.objects.AnyObject
import dagger.Module
import dagger.Provides

@Module
class FeatureTwoModule {

    @Provides
    fun provideFeatureTwo() = AnyObject()
}