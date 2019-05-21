package com.example.admin.daggervskoin.dagger

class War (private val starks: Starks,
                              private val boltons: Boltons
) {
    fun prepare(){
        starks.prepareForWar()
        boltons.prepareForWar()
    }

    fun report(){
        starks.reportForWar()
        boltons.reportForWar()
    }
}