package com.app.ecommerceapp.core

import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import hideKeyboard

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // resetTitles()
        hideKeyboard()
    }

    protected fun resetTitles() {
        try {
            val info = packageManager.getActivityInfo(
                componentName,
                PackageManager.GET_META_DATA
            )
            if (info.labelRes != 0) {
                setTitle(info.labelRes)
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
    }
}