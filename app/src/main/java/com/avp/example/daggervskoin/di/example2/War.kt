package com.avp.example.daggervskoin.di.example2

/*
* Example 2: Scenario 2 with dependency injection
* */
class War(
    private val starks: Starks,
    private val boltons: Boltons
) {
    fun prepar(){
        starks.prepareForWar()
        boltons.prepareForWar()
    }

    fun report(){
        starks.reportForWar()
        boltons.reportForWar()
    }
}