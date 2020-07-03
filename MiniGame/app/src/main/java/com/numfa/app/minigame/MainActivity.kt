package com.numfa.app.minigame

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        t.setText("Is phone?")
        yesbtn.setOnClickListener {
            Toast.makeText(this,"Yes",Toast.LENGTH_LONG).show()
        }
        nobtn.setOnClickListener {
            Toast.makeText(this,"No",Toast.LENGTH_LONG).show()
        }

        // Enables Always-on
        setAmbientEnabled()
    }
}
