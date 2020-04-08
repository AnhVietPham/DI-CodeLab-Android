package com.avp.practices.codelab.common

import android.arch.lifecycle.ViewModel

class LoginViewModel(
    private val userRepository: UserRepository
) : ViewModel()