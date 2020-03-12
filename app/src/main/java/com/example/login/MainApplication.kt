package com.example.login

import android.app.Application
import com.example.login.containerdependencies.AppContainer

class MainApplication : Application(){
    val appContainer = AppContainer()
}