package com.ivianuu.rxactivityresultextensions.sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.ivianuu.rxactivityresultextensions.isOk
import com.ivianuu.rxactivityresultextensions.registerRxActivityResult
import com.ivianuu.rxactivityresultextensions.startIntentRx

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        application.registerRxActivityResult()

        startIntentRx(Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS))
                .filter { it.isOk() }
                .map { it.data() }
                .subscribe()
    }
}
