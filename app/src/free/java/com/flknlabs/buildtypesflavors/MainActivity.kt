package com.flknlabs.buildtypesflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "This is a free app", Toast.LENGTH_SHORT).show()

        if (BuildConfig.FLAVOR == "free") {}

        if (BuildConfig.BUILD_TYPE == "debug") {}
    }
}