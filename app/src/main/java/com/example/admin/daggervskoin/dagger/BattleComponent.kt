package com.example.admin.daggervskoin.dagger

import dagger.Component

@Component
interface BattleComponent {
    fun getWar() : War
}