package com.flknlabs.buildtypesflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Snackbar.make(findViewById(R.id.textview), "This is a paid version", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();

    }
}