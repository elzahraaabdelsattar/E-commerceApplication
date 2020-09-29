package com.app.ecommerceapp.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.app.e_commerceapplication.MainActivity
import com.app.ecommerceapp.R

class ForgetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        val resetButton: Button = findViewById(R.id.reset_password_button)
        resetButton.setOnClickListener{
        val i =Intent(this , MainActivity::class.java)
        startActivity(i)}
    }
}
