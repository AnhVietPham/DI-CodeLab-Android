package com.avp.example.daggervskoin.dagger.example_dagger_module_provide_annotation

import dagger.Module
import dagger.Provides

@Module
class BraavosModule(
    private val cash: Cash,
    private val soliders: Soliders
)
{
    @Provides
    fun provideCash(): Cash {
        return cash
    }

    @Provides
    fun provideSoliders(): Soliders {
        return soliders
    }
}