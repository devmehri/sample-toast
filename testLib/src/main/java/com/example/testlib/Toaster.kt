package com.example.testlib

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun showToas(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}