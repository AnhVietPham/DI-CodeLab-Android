package com.example.admin.daggervskoin.dagger

import com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation.War
import dagger.Component

@Component
interface BattleComponent {
    fun getWar() : War
}