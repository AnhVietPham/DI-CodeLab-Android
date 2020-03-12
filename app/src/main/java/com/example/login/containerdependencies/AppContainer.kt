package com.example.login.containerdependencies

import com.example.login.common.LoginService
import com.example.login.common.UserLocalDataSource
import com.example.login.common.UserRemoteDataSource
import com.example.login.manualdi.UserRepository
import retrofit2.Retrofit

class AppContainer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://example.com")
        .build()
        .create(LoginService::class.java)

    private val remoteDataSource = UserRemoteDataSource(retrofit)
    private val localDataSource = UserLocalDataSource()

    private val userRepository = UserRepository(localDataSource, remoteDataSource)

    /**
     * Persist data from an old login flow from a different user
     * */
//    val loginViewModelFactory = LoginViewModelFactory(userRepository)

    val loginContainer: LoginContainer? = null

}