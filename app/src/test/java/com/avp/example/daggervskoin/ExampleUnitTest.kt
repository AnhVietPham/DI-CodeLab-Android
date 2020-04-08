package com.avp.example.daggervskoin

import com.avp.example.daggervskoin.dagger.DaggerBattleComponent
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        // Dagger 2
//        val starks = Starks()
//        val boltons = Boltons()
//        val war = War(starks = starks, boltons = boltons)
//        war.prepar()
//        war.report()

//        val cash = Cash()
//        val soliders = Soliders()
//
//        val component = DaggerBattleComponent.builder().braavosModule(BraavosModule(
//            cash = cash,
//            soliders = soliders
//        )).build()
//        val war = component.getWar()
//        war.prepare()
//        war.report()
//
//        component.getCash()
//        component.getSoliders()
//
        val component = DaggerBattleComponent.create()
        val war = component.getWar()
        war.prepare()
        war.report()
        // Koin
//        val module = module {
//            single {
//                Boltons()
//            }
//
//            single {
//                Starks()
//            }
//
//            single {
//                WarImpl(boltons = get(),
//                    starks = get()) as War
//            }
//        }
//        startKoin(listOf(module))
//        BattleComponentKoin().requestWar()
    }


}