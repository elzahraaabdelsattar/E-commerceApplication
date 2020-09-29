package com.app.ecommerceapp.ui

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.app.ecommerceapp.R
import com.app.ecommerceapp.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        splash_screen_image_view.alpha=0f
        splash_screen_image_view.animate().setDuration(2000).alpha(1f).withEndAction {
            val i=Intent(this,LoginActivity::class.java)
            startActivity(i)
        }




}



    }
