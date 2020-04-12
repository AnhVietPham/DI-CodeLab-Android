package com.avp.practices.codelab_guide.containerdependencies

import com.avp.practices.codelab_guide.common.LoginService
import com.avp.practices.codelab_guide.common.UserLocalDataSource
import com.avp.practices.codelab_guide.common.UserRemoteDataSource
import com.avp.practices.codelab_guide.common.UserRepository
import retrofit2.Retrofit

class AppContainer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://example.com")
        .build()
        .create(LoginService::class.java)

    private val remoteDataSource = UserRemoteDataSource(retrofit)
    private val localDataSource = UserLocalDataSource()

    private val userRepository = UserRepository(
        localDataSource,
        remoteDataSource
    )

    /**
     * Persist data from an old login flow from a different user
     * */
//    val loginViewModelFactory = LoginViewModelFactory(userRepository)

    val loginContainer: LoginContainer? = null

}