package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

class ToastMessage {
    companion object {
        fun s(c: Context, message: String) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT)
        }
    }
}