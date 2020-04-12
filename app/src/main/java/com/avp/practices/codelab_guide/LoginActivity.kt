package com.avp.practices.codelab_guide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avp.example.daggervskoin.R
import com.avp.practices.codelab_guide.dagger_in_android_app.LoginViewModelDagger
import com.avp.practices.codelab_guide.dagger_in_android_app.component.LoginComponent
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModelDagger

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent = (applicationContext as MainApplication)
            .appComponent.loginComponent().create()
        loginComponent.inject(this)
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
//        loginViewModel = appContainer.loginViewModelFactory.create()
//        val appContainer = (application as MainApplication).appContainer
//        loginViewModel = appContainer.loginContainer?.loginViewModelFactory

    }
}