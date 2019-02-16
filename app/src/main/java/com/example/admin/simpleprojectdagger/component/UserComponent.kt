package com.example.admin.simpleprojectdagger.component

import com.example.admin.simpleprojectdagger.interfaces.RandomUserApplicationScope
import com.example.admin.simpleprojectdagger.interfaces.RandomUsersApi
import com.example.admin.simpleprojectdagger.module.PicassoModule
import com.example.admin.simpleprojectdagger.module.UserModule
import com.squareup.picasso.Picasso
import dagger.Component

@RandomUserApplicationScope
@Component(modules = [UserModule::class, PicassoModule::class])
interface UserComponent {
    fun getRandomUserService(): RandomUsersApi
    fun getPicaso(): Picasso
}