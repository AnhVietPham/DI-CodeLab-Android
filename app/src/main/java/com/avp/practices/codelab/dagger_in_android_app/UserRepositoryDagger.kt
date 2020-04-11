package com.avp.practices.codelab.dagger_in_android_app

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepositoryDagger @Inject constructor(
    private val localDataSource: UserLocalDataSourceDagger,
    private val remoteDataSource: UserRemoteDataSourceDagger
)