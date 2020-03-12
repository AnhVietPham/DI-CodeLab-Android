package com.example.login.manualdi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.admin.daggervskoin.R
import retrofit2.Retrofit

/**
 * Document : https://developer.android.com/training/dependency-injection/manual#kotlin
 * */
class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(LoginService::class.java)

        val remoteDataSource = UserRemoteDataSource(retrofit)
        val localDataSource = UserLocalDataSource()

        val userRepository = UserRepository(localDataSource, remoteDataSource)

        loginViewModel = LoginViewModel(userRepository)
    }
}