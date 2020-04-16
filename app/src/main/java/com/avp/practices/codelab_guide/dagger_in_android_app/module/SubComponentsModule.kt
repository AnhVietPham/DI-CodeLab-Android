package com.avp.practices.codelab_guide.dagger_in_android_app.module

import com.avp.practices.codelab_guide.dagger_in_android_app.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
class SubComponentsModule