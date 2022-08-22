package com.manjitech.jaruploader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.manjitech.library_toast.ToastUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvTest).setOnClickListener {
            ToastUtil.show(applicationContext, "hello world")
        }
    }
}