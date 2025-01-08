package com.surendramaran.yolov8tflite

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Feature : AppCompatActivity() {
        private var buttonT: Button? = null
        private var buttonB: Button? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.feature)
            buttonT = findViewById<View>(R.id.button_top) as Button
            buttonT!!.setOnClickListener {
                val intent2 = Intent(this@Feature, Activity_main::class.java)
                startActivity(intent2)
            }

            buttonB = findViewById<View>(R.id.button_bottom) as Button
            buttonB!!.setOnClickListener {
                val intent3 = Intent(this@Feature, About::class.java)
                startActivity(intent3)
            }
        }
    }
