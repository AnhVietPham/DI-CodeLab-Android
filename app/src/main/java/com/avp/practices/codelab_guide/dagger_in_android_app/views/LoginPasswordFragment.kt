package com.avp.practices.codelab_guide.dagger_in_android_app.views

import android.content.Context
import androidx.fragment.app.Fragment
import com.avp.practices.codelab_guide.LoginActivity
import com.avp.practices.codelab_guide.dagger_in_android_app.LoginViewModelDagger
import javax.inject.Inject

class LoginPasswordFragment : Fragment() {
    @Inject
    lateinit var loginViewModel: LoginViewModelDagger

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as LoginActivity).loginComponent.inject(this)
    }
}