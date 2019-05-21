package com.example.admin.daggervskoin.dagger

import com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation.House
import javax.inject.Inject

class Boltons @Inject constructor(): House {
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }
}