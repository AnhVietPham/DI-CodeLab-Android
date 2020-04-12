package com.avp.practices.codelab_guide.common

class UserRepository (
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
    ){}