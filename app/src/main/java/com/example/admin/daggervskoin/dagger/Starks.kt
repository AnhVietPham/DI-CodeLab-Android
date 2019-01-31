package com.example.admin.daggervskoin.dagger

import javax.inject.Inject

class Starks @Inject constructor() : House {
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " prepare for War Using Dagger")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }

}