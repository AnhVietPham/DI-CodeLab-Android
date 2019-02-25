package com.example.admin.daggervskoin.koin

class WarImpl(private val boltons: Boltons,
              private val starks: Starks) : War{
    override fun prepare() {
        boltons.prepareForWar()
        starks.prepareForWar()
    }

    override fun report() {
        starks.reportForWar()
        boltons.reportForWar()
    }

}