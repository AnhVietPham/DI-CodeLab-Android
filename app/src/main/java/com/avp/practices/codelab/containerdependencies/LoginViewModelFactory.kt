package com.avp.practices.codelab.containerdependencies

import android.arch.lifecycle.ViewModel
import com.avp.practices.codelab.common.LoginViewModel
import com.avp.practices.codelab.common.UserRepository

class LoginViewModelFactory (private val userRepository: UserRepository) : Factory<ViewModel>{
    override fun create(): LoginViewModel {
        return LoginViewModel(userRepository)
    }

}