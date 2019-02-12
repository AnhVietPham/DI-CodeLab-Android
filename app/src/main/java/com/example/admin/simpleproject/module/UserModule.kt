package com.example.admin.simpleproject.module

import com.example.admin.simpleproject.interfaces.RandomUsersApi
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module(includes = [OkHttpClientModule::class])
class UserModule {

    @Provides
    fun userApi(retrofit: Retrofit): RandomUsersApi {
        return retrofit.create(RandomUsersApi::class.java)
    }

    @Provides
    fun retrofit(
        okHttpClient : OkHttpClient,
        gsonConverterFactory: GsonConverterFactory,
        gson: Gson
    ) : Retrofit{
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://randomuser.me/")
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    fun gson(): Gson {
        val gsonBuilder = GsonBuilder()
        return gsonBuilder.create()
    }

    @Provides
    fun gsonConverterFactory(gson: Gson): GsonConverterFactory {
        return GsonConverterFactory.create(gson)
    }
}