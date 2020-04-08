package com.avp.practices.codelab.manualdi

import android.arch.lifecycle.ViewModel

class LoginViewModel(
    private val userRepository: UserRepository
) : ViewModel()