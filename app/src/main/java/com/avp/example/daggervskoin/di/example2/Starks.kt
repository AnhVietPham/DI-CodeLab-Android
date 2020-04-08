package com.avp.example.daggervskoin.di.example2

class Starks : House {
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " prepare for War")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " report for War")
    }
}