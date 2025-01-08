package com.surendramaran.yolov8tflite

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Landing : AppCompatActivity() {
    var DButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing)
        DButton = findViewById<View>(R.id.d_button) as Button
        DButton!!.setOnClickListener {
            val intent = Intent(this@Landing, Feature::class.java)
            startActivity(intent)
        }

    }
}
