package com.avp.practices.codelab_guide.dagger_in_multi_module_android_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avp.example.daggervskoin.R
import com.avp.modulecore.components.DaggerCoreComponent
import com.avp.mymoduleone.FeatureOneActivity
import com.avp.mymoduletwo.FeatureTwoActivity
import com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.components.DaggerMainComponent
import com.avp.practices.codelab_guide.dagger_in_multi_module_android_app.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent.builder()
            .coreComponent(DaggerCoreComponent.create())
            .build()
            .inject(this)


        tvMain.text = mainViewModel.anyObject.provideProperty()
        tvRemoteApiService.text = mainViewModel.remoteAPIService.handleRemoteApiService()

        btnGoToFeatureOne.setOnClickListener {
            startActivity(Intent(this, FeatureOneActivity::class.java))
        }

        btnGoToFeatureTwo.setOnClickListener {
            startActivity(Intent(this, FeatureTwoActivity::class.java))
        }
    }
}