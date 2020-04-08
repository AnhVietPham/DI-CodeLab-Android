package com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation

import javax.inject.Inject

class Boltons @Inject constructor() : House {
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }
}