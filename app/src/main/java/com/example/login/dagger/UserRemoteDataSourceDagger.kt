package com.example.login.dagger

import com.example.login.common.LoginService
import javax.inject.Inject

class UserRemoteDataSourceDagger @Inject constructor(
    private val loginService: LoginService
)