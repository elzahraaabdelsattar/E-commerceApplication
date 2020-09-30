package com.app.ecommerceapp.ui.login

import android.os.Bundle
import android.widget.Toast
import com.app.ecommerceapp.R
import com.app.ecommerceapp.core.BaseActivity
import com.app.ecommerceapp.core.hide
import com.app.ecommerceapp.core.show
import com.app.ecommerceapp.data.model.ForgetPassword
import com.app.ecommerceapp.data.model.ResponseDto
import com.app.ecommerceapp.data.remote.APIs
import kotlinx.android.synthetic.main.activity_forget_password.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ForgetPasswordActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        reset_password_button.setOnClickListener {
            forgetPassword()
        }




    }

    private fun forgetPassword() {

        val email= email_reset_password_editText.text.toString()

        // Validation
        if (email.isEmpty()) {
            email_reset_password_editText.error = "Email Required"
            return
        }
        forget_password_progressBar.show()
        reset_password_button.isEnabled = false

        APIs.getApiClient().resetPassword(email)
            .enqueue(object : Callback<ResponseDto<ForgetPassword>> {
                override fun onResponse(
                    call: Call<ResponseDto<ForgetPassword>>,
                    response: Response<ResponseDto<ForgetPassword>>
                ) {
                    if (response.code() == 200) {
                  
                    }
                    else{
                        Toast.makeText(
                            this@ForgetPasswordActivity,
                            "Invalidate Data",
                            Toast.LENGTH_LONG
                        ).show()

                    }

                    forget_password_progressBar.hide()
                    reset_password_button.isEnabled = true
                }

                override fun onFailure(
                    call: Call<ResponseDto<ForgetPassword>>,
                    t: Throwable
                ) {
                    Toast.makeText(this@ForgetPasswordActivity, t.message, Toast.LENGTH_SHORT).show()

                    forget_password_progressBar.hide()
                    reset_password_button.isEnabled = true


                }
            })


    }
}
