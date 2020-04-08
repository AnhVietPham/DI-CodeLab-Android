package com.avp.practices.codelab.manualdi

import com.avp.practices.codelab.common.UserLocalDataSource
import com.avp.practices.codelab.common.UserRemoteDataSource

class UserRepository (
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
    ){}