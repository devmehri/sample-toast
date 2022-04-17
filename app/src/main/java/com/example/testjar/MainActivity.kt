package com.example.testjar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testlib.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.showToas(this, "Hello test!")
    }
}