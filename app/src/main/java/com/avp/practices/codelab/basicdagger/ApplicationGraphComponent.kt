package com.avp.practices.codelab.basicdagger

import dagger.Component

@Component
interface ApplicationGraphComponent {
    fun productRepository(): ProductRepository
}