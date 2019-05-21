package com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation

import dagger.Module
import dagger.Provides

@Module
class BraavosModule {
    @Provides
    fun provideCash(offlineBank: OfflineBank, onlineBank: OnlineBank): Cash {
        return Cash(offlineBank = offlineBank, onlineBank = onlineBank)
    }

    @Provides
    fun provideSoliders(armory: Armory): Soliders {
        return Soliders(armory = armory)
    }
}