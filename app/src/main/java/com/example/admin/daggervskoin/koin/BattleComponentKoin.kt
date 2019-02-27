package com.example.admin.daggervskoin.koin

import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class BattleComponentKoin : KoinComponent {
    val warImpl : War by inject()

    fun requestWar(){
        warImpl.prepare()
        warImpl.report()
    }
}