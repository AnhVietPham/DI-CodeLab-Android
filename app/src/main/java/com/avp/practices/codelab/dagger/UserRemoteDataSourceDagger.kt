package com.avp.practices.codelab.dagger

import com.avp.practices.codelab.common.LoginService
import javax.inject.Inject

class UserRemoteDataSourceDagger @Inject constructor(
    private val loginService: LoginService
)