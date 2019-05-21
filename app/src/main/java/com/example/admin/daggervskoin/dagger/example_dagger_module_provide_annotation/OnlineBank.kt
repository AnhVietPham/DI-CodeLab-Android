package com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation

import javax.inject.Inject

class OnlineBank @Inject constructor(): Bank{
    override fun withDraw() {
        System.out.println(this.javaClass.simpleName + " withdraw money from Online")
    }
}