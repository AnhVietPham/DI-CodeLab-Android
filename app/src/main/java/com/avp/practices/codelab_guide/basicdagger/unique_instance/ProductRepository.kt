package com.avp.practices.codelab_guide.basicdagger.unique_instance

import com.avp.practices.codelab_guide.basicdagger.ProductLocalDataSource
import com.avp.practices.codelab_guide.basicdagger.ProductRemoteDataSource
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val productLocalDataSource: ProductLocalDataSource,
    private val productRemoteDataSource: ProductRemoteDataSource
) {}