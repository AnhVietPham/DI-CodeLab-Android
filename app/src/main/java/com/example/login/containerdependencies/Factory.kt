package com.example.login.containerdependencies

interface Factory<T> {
    fun create(): T
}