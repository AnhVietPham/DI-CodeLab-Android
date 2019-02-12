package com.example.admin.simpleproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.admin.daggervskoin.R.layout.activity_main
import com.example.admin.simpleproject.adapter.UserAdapter
import retrofit2.Retrofit
import com.example.admin.simpleproject.model.User
import timber.log.Timber
import com.google.gson.GsonBuilder
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory
import com.example.admin.simpleproject.interfaces.RandomUsersApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var retrofit: Retrofit
    private lateinit var recyclerView: RecyclerView
    private lateinit var mAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        initViews()

        val gsonBuilder = GsonBuilder()
        val gson = gsonBuilder.create()

        Timber.plant(Timber.DebugTree())

        val httpLoggingInterceptor =
            HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message ->
                Timber.i(message)
            })
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient()
            .newBuilder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://randomuser.me/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        populateUsers()
    }

    private fun populateUsers() {
        val callUsers = getUserService().getRandomUsers(10)
        callUsers.enqueue(object : Callback<User>{
            override fun onFailure(call: Call<User>, t: Throwable) {
                Timber.i(t.message)
            }

            override fun onResponse(call: Call<User>, response: Response<User>) {
                if (response.isSuccessful) {
                    mAdapter = UserAdapter()
                    response.body()?.let { user ->
                        mAdapter.setItems(user.results)
                    }
                    recyclerView.adapter = mAdapter
                }
            }

        })
    }

    private fun initViews() {
        recyclerView = findViewById(com.example.admin.daggervskoin.R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun getUserService() : RandomUsersApi{
        return retrofit.create(RandomUsersApi::class.java)
    }
}
