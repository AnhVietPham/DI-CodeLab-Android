package com.avp.practices.codelab.dagger_in_android_app

import javax.inject.Inject

@ActivityScope
class LoginViewModelDagger @Inject constructor(
     val userRepositoryDagger: UserRepositoryDagger
)