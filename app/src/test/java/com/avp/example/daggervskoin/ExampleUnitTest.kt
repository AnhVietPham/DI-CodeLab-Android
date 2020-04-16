package com.avp.example.daggervskoin

import com.avp.example.daggervskoin.dagger.DaggerBattleComponent
import com.avp.modulecore.components.DaggerCoreComponent
import com.avp.practices.codelab_guide.basicdagger.same_instance.DaggerApplicationGraphProductScopeComponent
import com.avp.practices.codelab_guide.basicdagger.unique_instance.ApplicationGraphComponent
import com.avp.practices.codelab_guide.basicdagger.unique_instance.DaggerApplicationGraphComponent
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

    @Test
    fun assert_unique_instance_dagger_component(){
        val applicationGraphComponent : ApplicationGraphComponent = DaggerApplicationGraphComponent.create()

        val productRepository1 = applicationGraphComponent.productRepository()
        val productRepository2 = applicationGraphComponent.productRepository()
        assert(productRepository1 != productRepository2)
    }

    @Test
    fun assert_the_same_instance_dagger_scope_component(){
        val applicationGraphProductScopeComponent = DaggerApplicationGraphProductScopeComponent.create()

        val productRepository1 = applicationGraphProductScopeComponent.productRepository()
        val productRepository2 = applicationGraphProductScopeComponent.productRepository()

        assert(productRepository1 == productRepository2)
    }

    @Test
    fun assert_the_same_Remote_API_Service(){
        val coreComponent = DaggerCoreComponent.create()

        val remoteAPIService1 = coreComponent.getRemoteApiService()
        val remoteAPIService2 = coreComponent.getRemoteApiService()

        assert(remoteAPIService1 == remoteAPIService2)
    }

}
