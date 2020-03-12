package com.example.login.dagger

import com.example.login.common.LoginService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Module
class NetWorkModule(val baseUrl: String) {

    @Singleton
    @Provides
    fun provideLoginRetrofitService(): LoginService {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .build()
            .create(LoginService::class.java)
    }
}