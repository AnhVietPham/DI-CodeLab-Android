package com.avp.mymoduletwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avp.modulecore.components.DaggerCoreComponent
import com.avp.mymoduletwo.components.DaggerFeatureTwoComponent
import com.avp.mymoduletwo.viewmodels.FeatureTwoViewModel
import kotlinx.android.synthetic.main.activity_feature_two.*
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var featureTwoViewModel: FeatureTwoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)

        DaggerFeatureTwoComponent.builder().coreComponent(DaggerCoreComponent.create()).build().inject(this)

        tvRemoteApiService.text = featureTwoViewModel.remoteAPIService.handleRemoteApiService()
        tvFeatureTwo.text = featureTwoViewModel.anyObject.provideFeatureTwo()

    }
}