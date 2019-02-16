package com.example.admin.simpleproject.features

import com.example.admin.simpleproject.adapter.UserAdapter
import com.example.admin.simpleproject.component.UserComponent
import com.example.admin.simpleproject.interfaces.RandomUsersApi
import dagger.Component

@MainActivityScope
@Component(modules = [MainActivityModule::class], dependencies = [UserComponent::class])
interface MainActivityComponent {
    fun getUserAdapter(): UserAdapter
    fun getUserService(): RandomUsersApi
}