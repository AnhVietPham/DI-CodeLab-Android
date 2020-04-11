package com.avp.practices.codelab.dagger_in_android_app

import com.avp.practices.codelab.common.LoginService
import javax.inject.Inject

class UserRemoteDataSourceDagger @Inject constructor(
    private val loginService: LoginService
)