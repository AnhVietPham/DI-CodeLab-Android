package com.example.admin.daggervskoin

import com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation.BraavosModule
import com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation.Cash
import com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation.DaggerBattleComponent
import com.example.admin.daggervskoin.dagger.example_dagger_module_provide_annotation.Soliders
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        val starks = Starks()
//        val boltons = Boltons()
//        val war = War(starks = starks, boltons = boltons)
//        war.prepar()
//        war.report()

        val cash = Cash()
        val soliders = Soliders()

        val component = DaggerBattleComponent.builder().braavosModule(BraavosModule(
            cash = cash,
            soliders = soliders
        )).build()
        val war = component.getWar()
        war.prepare()
        war.report()

        component.getCash()
        component.getSoliders()
    }
}
