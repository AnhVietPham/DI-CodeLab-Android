package com.avp.mymoduleone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avp.modulecore.components.DaggerCoreComponent
import com.avp.mymoduleone.components.DaggerFeatureOneComponent
import com.avp.mymoduleone.viewmodels.FeatureOneViewModel
import kotlinx.android.synthetic.main.activity_feature_one.*
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity() {
    @Inject
    lateinit var featureOneViewModel: FeatureOneViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)

        DaggerFeatureOneComponent.builder().coreComponent(DaggerCoreComponent.create()).build().inject(this)

        tvRemoteApiService.text = featureOneViewModel.remoteAPIService.handleRemoteApiService()
        tvFeatureOne.text = featureOneViewModel.anyObject.provideFeatureOne()
    }
}