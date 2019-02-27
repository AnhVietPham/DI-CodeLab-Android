package com.example.admin.daggervskoin.koin

class Boltons : House{
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " report for War Using Dagger")
    }

}