package com.avp.practices.codelab.dagger

import javax.inject.Inject

class LoginViewModelDagger @Inject constructor(
    private val userRepositoryDagger: UserRepositoryDagger
)