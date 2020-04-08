package com.avp.example.simpleprojectdagger.component

import com.avp.example.simpleprojectdagger.interfaces.RandomUserApplicationScope
import com.avp.example.simpleprojectdagger.interfaces.RandomUsersApi
import com.avp.example.simpleprojectdagger.module.PicassoModule
import com.avp.example.simpleprojectdagger.module.UserModule
import com.squareup.picasso.Picasso
import dagger.Component

@RandomUserApplicationScope
@Component(modules = [UserModule::class, PicassoModule::class])
interface UserComponent {
    fun getRandomUserService(): RandomUsersApi
    fun getPicaso(): Picasso
}