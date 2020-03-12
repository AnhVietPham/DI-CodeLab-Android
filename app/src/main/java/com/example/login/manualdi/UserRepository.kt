package com.example.login.manualdi

import com.example.login.common.UserLocalDataSource
import com.example.login.common.UserRemoteDataSource

class UserRepository (
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
    ){}