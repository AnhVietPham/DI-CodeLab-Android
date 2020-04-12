package com.avp.practices.codelab_guide.containerdependencies

import com.avp.practices.codelab_guide.common.LoginUserData
import com.avp.practices.codelab_guide.common.LoginViewModel
import com.avp.practices.codelab_guide.common.UserRepository

class LoginContainer (
    userRepository: UserRepository
){
    val loginData = LoginUserData()
    val loginViewModelFactory =
        LoginViewModel(userRepository)
}