package com.avp.mymoduleone.components

import com.avp.modulecore.components.CoreComponent
import com.avp.modulecore.scope.FeatureScope
import com.avp.mymoduleone.FeatureOneActivity
import com.avp.mymoduleone.modules.FeatureOneModule
import dagger.Component

@Component(modules = [FeatureOneModule::class], dependencies = [CoreComponent::class])
@FeatureScope
interface FeatureOneComponent {
    fun inject(activity: FeatureOneActivity)
}