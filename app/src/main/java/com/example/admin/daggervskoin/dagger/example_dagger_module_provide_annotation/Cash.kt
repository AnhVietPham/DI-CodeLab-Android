package com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation

class Cash(
    private val offlineBank: OfflineBank,
    private val onlineBank: OnlineBank
) {
    init {
        System.out.println(this.javaClass.simpleName + " Dagger is using Cash")
    }

    fun useOnlineMoney() {
        offlineBank.withDraw()
    }

    fun useOfflineMoney(){
        onlineBank.withDraw()
    }
}