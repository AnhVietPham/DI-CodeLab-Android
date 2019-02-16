package com.example.admin.simpleprojectdagger.features

import com.example.admin.simpleprojectdagger.adapter.UserAdapter
import com.example.admin.simpleprojectdagger.component.UserComponent
import com.example.admin.simpleprojectdagger.interfaces.RandomUsersApi
import dagger.Component

@MainActivityScope
@Component(modules = [MainActivityModule::class], dependencies = [UserComponent::class])
interface MainActivityComponent {
    fun getUserAdapter(): UserAdapter
    fun getUserService(): RandomUsersApi
}