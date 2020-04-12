package com.avp.practices.codelab_guide.basicdagger.unique_instance

import dagger.Component

@Component
interface ApplicationGraphComponent {
    fun productRepository(): ProductRepository
}