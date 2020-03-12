package com.example.login.containerdependencies

import com.example.login.common.LoginUserData
import com.example.login.manualdi.LoginViewModel
import com.example.login.manualdi.UserRepository

class LoginContainer (
    userRepository: UserRepository
){
    val loginData = LoginUserData()
    val loginViewModelFactory = LoginViewModel(userRepository)
}