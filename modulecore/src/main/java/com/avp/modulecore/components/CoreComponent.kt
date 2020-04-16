package com.avp.modulecore.components

import com.avp.modulecore.api.RemoteAPIService
import com.avp.modulecore.modules.CoreModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [CoreModule::class])
@Singleton
interface CoreComponent {
    fun getRemoteApiService() : RemoteAPIService
}