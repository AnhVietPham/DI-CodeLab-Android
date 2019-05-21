package com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation

class Soliders(private val armory: Armory) {
    init {
        System.out.println(this.javaClass.simpleName + " Dagger is using Soliders")
    }

    fun useWeapon(){
        armory.getWeapon()
    }
}