package com.example.login.containerdependencies

import android.arch.lifecycle.ViewModel
import com.example.login.manualdi.LoginViewModel
import com.example.login.manualdi.UserRepository

class LoginViewModelFactory (private val userRepository: UserRepository) : Factory<ViewModel>{
    override fun create(): LoginViewModel {
        return LoginViewModel(userRepository)
    }

}