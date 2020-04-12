package com.avp.practices.codelab_guide.dagger_in_android_app.component

import com.avp.practices.codelab_guide.LoginActivity
import com.avp.practices.codelab_guide.dagger_in_android_app.ActivityScope
import com.avp.practices.codelab_guide.dagger_in_android_app.views.LoginPasswordFragment
import com.avp.practices.codelab_guide.dagger_in_android_app.views.LoginUserNameFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory{
        fun create(): LoginComponent
    }

    fun inject(loginActivity : LoginActivity)
    fun inject(loginUserNameFragment: LoginUserNameFragment)
    fun inject(loginPasswordFragment: LoginPasswordFragment)
}