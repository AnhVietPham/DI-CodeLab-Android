package com.example.admin.daggervskoin.dagger.example1

/*
* Example 1: Scenario 1 without dependency injection
* */
class War {
    private lateinit var starks: Starks
    private lateinit var boltons: Boltons

    fun war() {
        starks = Starks()
        boltons = Boltons()

        starks.prepareForWar()
        starks.reportForWar()

        boltons.prepareForWar()
        boltons.reportForWar()
    }
}