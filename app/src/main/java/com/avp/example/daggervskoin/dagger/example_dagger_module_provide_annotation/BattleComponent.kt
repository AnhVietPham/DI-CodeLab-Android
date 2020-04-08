package com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation

import dagger.Component

@Component(modules = [BraavosModule::class])
interface BattleComponent {
    fun getWar() : War
    fun getCash() : Cash
    fun getSoliders() : Soliders
}