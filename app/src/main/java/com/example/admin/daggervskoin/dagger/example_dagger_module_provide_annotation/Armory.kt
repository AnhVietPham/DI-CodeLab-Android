package com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation

import javax.inject.Inject

class Armory @Inject constructor() {
    fun getWeapon() {
        System.out.println("Get the Weapon")
    }
}