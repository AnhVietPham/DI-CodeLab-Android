package com.avp.example.daggervskoin.dagger

import com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation.House
import javax.inject.Inject

class Starks @Inject constructor() : House {
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " prepare for War Using Dagger")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }

}