package com.avp.example.simpleprojectdagger.features

import com.avp.example.simpleprojectdagger.adapter.UserAdapter
import com.avp.example.simpleprojectdagger.component.UserComponent
import com.avp.example.simpleprojectdagger.interfaces.RandomUsersApi
import dagger.Component

@MainActivityScope
@Component(modules = [MainActivityModule::class], dependencies = [UserComponent::class])
interface MainActivityComponent {
    fun getUserAdapter(): UserAdapter
    fun getUserService(): RandomUsersApi
}