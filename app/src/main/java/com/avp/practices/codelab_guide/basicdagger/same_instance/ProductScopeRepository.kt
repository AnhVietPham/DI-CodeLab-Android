package com.avp.practices.codelab_guide.basicdagger.same_instance


import com.avp.practices.codelab_guide.basicdagger.ProductLocalDataSource
import com.avp.practices.codelab_guide.basicdagger.ProductRemoteDataSource
import javax.inject.Inject

@ProductScope
class ProductScopeRepository @Inject constructor(
    private val productLocalDataSource: ProductLocalDataSource,
    private val productRemoteDataSource: ProductRemoteDataSource
) {}