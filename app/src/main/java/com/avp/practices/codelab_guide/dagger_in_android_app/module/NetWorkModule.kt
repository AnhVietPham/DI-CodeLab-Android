package com.avp.practices.codelab_guide.dagger_in_android_app.module

import com.avp.practices.codelab_guide.common.LoginService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit


@Module
class NetWorkModule(private val baseUrl: String) {


    @Provides
    fun provideLoginRetrofitService(): LoginService {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .build()
            .create(LoginService::class.java)
    }
}