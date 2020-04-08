package com.avp.practices.codelab.basicdagger.unique_instance

import dagger.Component

@Component
interface ApplicationGraphComponent {
    fun productRepository(): ProductRepository
}