package com.surendramaran.yolov8tflite

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Landing : AppCompatActivity() {
    private var dButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing)
        dButton = findViewById<View>(R.id.d_button) as Button
        dButton!!.setOnClickListener {
            val intent = Intent(this@Landing, Feature::class.java)
            startActivity(intent)
        }

    }
}
