package com.avp.practices.codelab.basicdagger.unique_instance

import com.avp.practices.codelab.basicdagger.ProductLocalDataSource
import com.avp.practices.codelab.basicdagger.ProductRemoteDataSource
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val productLocalDataSource: ProductLocalDataSource,
    private val productRemoteDataSource: ProductRemoteDataSource
) {}