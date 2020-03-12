package com.example.login.dagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryDagger @Inject constructor(
    private val localDataSource: UserLocalDataSourceDagger,
    private val remoteDataSource: UserRemoteDataSourceDagger
)