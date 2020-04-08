package com.avp.practices.codelab.containerdependencies

import com.avp.practices.codelab.common.LoginUserData
import com.avp.practices.codelab.common.LoginViewModel
import com.avp.practices.codelab.common.UserRepository

class LoginContainer (
    userRepository: UserRepository
){
    val loginData = LoginUserData()
    val loginViewModelFactory =
        LoginViewModel(userRepository)
}