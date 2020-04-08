package com.avp.example.simpleprojectdagger.features

import com.avp.example.simpleprojectdagger.MainActivity
import com.avp.example.simpleprojectdagger.adapter.UserAdapter
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