package com.avp.practices.codelab_guide.common

import androidx.lifecycle.ViewModel

class LoginViewModel(
    private val userRepository: UserRepository
) : ViewModel()