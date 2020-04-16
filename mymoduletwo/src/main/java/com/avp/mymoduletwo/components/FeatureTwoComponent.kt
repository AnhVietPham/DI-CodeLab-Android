package com.avp.mymoduletwo.components

import com.avp.modulecore.components.CoreComponent
import com.avp.modulecore.scope.FeatureScope
import com.avp.mymoduletwo.FeatureTwoActivity
import com.avp.mymoduletwo.modules.FeatureTwoModule
import dagger.Component

@Component(modules = [FeatureTwoModule::class], dependencies = [CoreComponent::class])
@FeatureScope
interface FeatureTwoComponent {
    fun inject(activity: FeatureTwoActivity)
}