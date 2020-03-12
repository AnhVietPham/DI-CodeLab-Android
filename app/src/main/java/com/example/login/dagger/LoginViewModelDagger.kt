package com.example.login.dagger

import javax.inject.Inject

class LoginViewModelDagger @Inject constructor(
    private val userRepositoryDagger: UserRepositoryDagger
)