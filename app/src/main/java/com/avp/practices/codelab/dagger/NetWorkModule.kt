package com.avp.practices.codelab.dagger

import com.avp.practices.codelab.common.LoginService
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