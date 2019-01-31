package com.example.admin.daggervskoin.dagger.example1

class Boltons : House{
    override fun prepareForWar() {
        System.out.println(this.javaClass.simpleName + " prepare for War")

    }

    override fun reportForWar() {
        System.out.println(this.javaClass.simpleName + " report for War")

    }

}