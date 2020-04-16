package com.avp.mymoduletwo.viewmodels

import com.avp.modulecore.api.RemoteAPIService
import com.avp.mymoduletwo.objects.AnyObject
import javax.inject.Inject

class FeatureTwoViewModel @Inject constructor(
    val remoteAPIService: RemoteAPIService,
    val anyObject: AnyObject
)