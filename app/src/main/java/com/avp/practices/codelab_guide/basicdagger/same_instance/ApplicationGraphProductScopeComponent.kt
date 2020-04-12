package com.avp.practices.codelab_guide.basicdagger.same_instance

import dagger.Component

@ProductScope
@Component
interface ApplicationGraphProductScopeComponent {
    fun productRepository(): ProductScopeRepository
}