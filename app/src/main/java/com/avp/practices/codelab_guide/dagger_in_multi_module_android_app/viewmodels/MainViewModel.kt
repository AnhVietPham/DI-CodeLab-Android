package com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.viewmodels

import com.avp.modulecore.api.RemoteAPIService
import com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.objects.AnyObject
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val remoteAPIService: RemoteAPIService,
    val anyObject: AnyObject
)