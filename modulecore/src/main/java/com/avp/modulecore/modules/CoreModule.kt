package com.avp.modulecore.modules

import com.avp.modulecore.api.RemoteAPIService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {

    @Provides
    @Singleton
    fun provideRemoteApiService() : RemoteAPIService = RemoteAPIService()
}