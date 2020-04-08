package com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation

class Cash {
    init {
        System.out.println(this.javaClass.simpleName + " Dagger is using Cash")
    }
}