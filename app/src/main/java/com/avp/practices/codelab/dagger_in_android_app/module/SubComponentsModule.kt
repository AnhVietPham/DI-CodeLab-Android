package com.avp.practices.codelab.dagger_in_android_app.module

import com.avp.practices.codelab.dagger_in_android_app.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
class SubComponentsModule {
}