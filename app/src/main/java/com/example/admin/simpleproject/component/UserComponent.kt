package com.example.admin.simpleproject.component

import com.example.admin.simpleproject.interfaces.RandomUserApplicationScope
import com.example.admin.simpleproject.interfaces.RandomUsersApi
import com.example.admin.simpleproject.module.PicassoModule
import com.example.admin.simpleproject.module.UserModule
import com.squareup.picasso.Picasso
import dagger.Component

@RandomUserApplicationScope
@Component(modules = [UserModule::class, PicassoModule::class])
interface UserComponent {
    fun getRandomUserService(): RandomUsersApi
    fun getPicaso(): Picasso
}