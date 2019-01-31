package com.example.admin.daggervskoin

import com.example.admin.daggervskoin.dagger.DaggerBattleComponent
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

        val component = DaggerBattleComponent.create()
        val war = component.getWar()
        war.prepare()
        war.report()
    }
}
