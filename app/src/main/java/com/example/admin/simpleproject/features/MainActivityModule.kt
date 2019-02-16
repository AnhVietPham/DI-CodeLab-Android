package com.example.admin.simpleproject.features

import com.example.admin.simpleproject.MainActivity
import com.example.admin.simpleproject.adapter.UserAdapter
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(private val mainActivity: MainActivity){
    @Provides
    @MainActivityScope
    fun userAdapter(picasso: Picasso): UserAdapter{
        return UserAdapter(mainActivity, picasso)
    }
}