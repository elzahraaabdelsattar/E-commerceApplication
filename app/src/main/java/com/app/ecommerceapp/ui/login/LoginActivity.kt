package com.app.ecommerceapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import com.app.ecommerceapp.R
import com.app.ecommerceapp.data.model.ResponseDto
import com.app.ecommerceapp.data.model.User
import com.app.ecommerceapp.data.remote.APIs
import com.readystatesoftware.chuck.internal.ui.MainActivity
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity(), LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        forget_password_login_textView.setOnClickListener {
            val int = Intent(this, ForgetPasswordActivity::class.java)
            startActivity(int)
        }

        signUp_login_textView.setOnClickListener {
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)

        }
        login_button.setOnClickListener {

            LogIn()


        }


    }

    private fun LogIn() {
        val email= email_login_editText.getText().toString().trim()
        val password = password_login_editText.getText().toString().trim()

        APIs.getApiClient().login(email, password)
            .enqueue(object : Callback<ResponseDto<User>> {
                override fun onResponse(
                    call: Call<ResponseDto<User>>,
                    response: Response<ResponseDto<User>>
                ) {
                    if (response.code() == 200) {
                        ///
                        val intent = Intent(this@LoginActivity, MainActivity::class.java)
                        intent.flags =
                            Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(intent)
                        finish()
                    }

                }

                override fun onFailure(
                    call: Call<ResponseDto<User>>,
                    t: Throwable
                ) {

                }
            })

    }
}