package com.example.admin.simpleprojectdagger.module

import android.content.Context
import com.example.admin.simpleprojectdagger.interfaces.ApplicationContext
import com.example.admin.simpleprojectdagger.interfaces.RandomUserApplicationScope
import com.jakewharton.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module(includes = [OkHttpClientModule::class])
class PicassoModule {
    @RandomUserApplicationScope
    @Provides
    fun picasso(/*@Named("application_context")*/@ApplicationContext context: Context, okHttp3Downloader: OkHttp3Downloader): Picasso {
        return Picasso.Builder(context).downloader(okHttp3Downloader).build()
    }

    @Provides
    fun okHttp3Downloader(okHttpClient: OkHttpClient): OkHttp3Downloader {
        return OkHttp3Downloader(okHttpClient)
    }
}