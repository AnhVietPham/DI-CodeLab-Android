package com.avp.practices.codelab_guide.containerdependencies

import androidx.lifecycle.ViewModel
import com.avp.practices.codelab_guide.common.LoginViewModel
import com.avp.practices.codelab_guide.common.UserRepository

class LoginViewModelFactory (private val userRepository: UserRepository) : Factory<ViewModel>{
    override fun create(): LoginViewModel {
        return LoginViewModel(userRepository)
    }

}