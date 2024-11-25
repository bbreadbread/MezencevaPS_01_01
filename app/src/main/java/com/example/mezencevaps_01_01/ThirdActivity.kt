package com.example.mezencevaps_01_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val value = intent.getStringExtra("value")
        val result = intent.getStringExtra("result")

        findViewById<TextView>(R.id.outputValues).text = value
        findViewById<TextView>(R.id.outputResult).text = result
    }

    fun comeback(view: View) {
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
    }
}
