package com.avp.practices.codelab_guide.containerdependencies

interface Factory<T> {
    fun create(): T
}