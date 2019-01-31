package com.example.admin.daggervskoin

import com.example.admin.daggervskoin.dagger.example1.War
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val war = War()
        war.war()
    }
}
