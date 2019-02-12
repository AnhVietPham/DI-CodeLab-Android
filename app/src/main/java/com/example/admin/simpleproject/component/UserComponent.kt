package com.example.admin.simpleproject.component

import com.example.admin.simpleproject.interfaces.RandomUsersApi
import com.squareup.picasso.Picasso
import dagger.Component

@Component
interface UserComponent {
    fun getRandomUserService(): RandomUsersApi
    fun getPicaso(): Picasso
}