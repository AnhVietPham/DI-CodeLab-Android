package com.avp.practices.codelab_guide.dagger_in_android_app

import com.avp.practices.codelab_guide.common.LoginService
import javax.inject.Inject

class UserRemoteDataSourceDagger @Inject constructor(
    private val loginService: LoginService
)