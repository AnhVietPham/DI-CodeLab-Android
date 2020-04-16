package com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.modules

import com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.objects.AnyObject
import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun provideMainModule() = AnyObject()
}