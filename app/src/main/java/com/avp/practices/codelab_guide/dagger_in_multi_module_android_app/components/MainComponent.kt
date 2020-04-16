package com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.components

import com.avp.modulecore.components.CoreComponent
import com.avp.modulecore.scope.FeatureScope
import com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.MainActivity
import com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.modules.MainModule
import dagger.Component

@Component(modules = [MainModule::class],dependencies = [CoreComponent::class])
@FeatureScope
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}