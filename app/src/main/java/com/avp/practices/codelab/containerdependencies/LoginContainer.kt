package com.avp.practices.codelab.containerdependencies

import com.avp.practices.codelab.common.LoginUserData
import com.avp.practices.codelab.manualdi.LoginViewModel
import com.avp.practices.codelab.manualdi.UserRepository

class LoginContainer (
    userRepository: UserRepository
){
    val loginData = LoginUserData()
    val loginViewModelFactory = LoginViewModel(userRepository)
}