package com.avp.practices.codelab.dagger_in_android_app

import javax.inject.Inject

class LoginViewModelDagger @Inject constructor(
    private val userRepositoryDagger: UserRepositoryDagger
)