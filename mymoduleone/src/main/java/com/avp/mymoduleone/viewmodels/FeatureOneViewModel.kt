package com.avp.mymoduleone.viewmodels

import com.avp.modulecore.api.RemoteAPIService
import com.avp.mymoduleone.objects.AnyObject
import javax.inject.Inject

class FeatureOneViewModel @Inject constructor(
    val remoteAPIService: RemoteAPIService,
    val anyObject: AnyObject
)