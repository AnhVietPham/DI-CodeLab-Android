package com.example.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.admin.daggervskoin.R
import com.example.login.manualdi.LoginViewModel

/**
 * Document : https://developer.android.com/training/dependency-injection/manual#kotlin
 * */
class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /**
         * This is manual DI
         * */
//        val retrofit = Retrofit.Builder()
//            .baseUrl("https://example.com")
//            .build()
//            .create(LoginService::class.java)
//
//        val remoteDataSource = UserRemoteDataSource(retrofit)
//        val localDataSource = UserLocalDataSource()
//
//        val userRepository =
//            UserRepository(localDataSource, remoteDataSource)

        /**
         * This is using Container
         * */
//        val appContainer = (application as MainApplication).appContainer
//        loginViewModel = LoginViewModel(appContainer.userRepository)

        /**
         * This is using Factory ViewModel
         * */
        val appContainer = (application as MainApplication).appContainer
        loginViewModel = appContainer.loginViewModelFactory.create()
    }
}