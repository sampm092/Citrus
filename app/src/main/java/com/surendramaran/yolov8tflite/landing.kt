package com.surendramaran.yolov8tflite

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class landing : AppCompatActivity() {
    var AButton: Button? = null
    var DButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing)
        DButton = findViewById<View>(R.id.d_button) as Button
        DButton!!.setOnClickListener {
            val intent = Intent(this@landing, Activity_main::class.java)
            startActivity(intent)
        }

        AButton = findViewById<View>(R.id.a_button) as Button
        AButton!!.setOnClickListener {
            val intent2 = Intent(this@landing, about::class.java)
            startActivity(intent2)
        }
    }
}
