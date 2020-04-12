package com.avp.practices.codelab.common

import androidx.lifecycle.ViewModel

class LoginViewModel(
    private val userRepository: UserRepository
) : ViewModel()