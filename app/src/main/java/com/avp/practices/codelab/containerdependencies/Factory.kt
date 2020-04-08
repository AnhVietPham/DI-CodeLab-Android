package com.avp.practices.codelab.containerdependencies

interface Factory<T> {
    fun create(): T
}