package com.avp.example.daggervskoin.dagger

import com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation.War
import dagger.Component

@Component
interface BattleComponent {
    fun getWar() : War
}