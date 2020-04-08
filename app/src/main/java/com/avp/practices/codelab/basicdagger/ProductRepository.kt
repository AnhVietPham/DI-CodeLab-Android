package com.avp.practices.codelab.basicdagger

import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val productLocalDataSource: ProductLocalDataSource,
    private val productRemoteDataSource: ProductRemoteDataSource
) {}