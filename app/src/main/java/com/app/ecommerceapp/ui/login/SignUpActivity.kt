package com.app.ecommerceapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.app.e_commerceapplication.MainActivity
import com.app.ecommerceapp.R
import com.app.ecommerceapp.core.BaseActivity
import com.app.ecommerceapp.core.hide
import com.app.ecommerceapp.core.hideKeyboard
import com.app.ecommerceapp.core.show
import com.app.ecommerceapp.data.local.TOKEN
import com.app.ecommerceapp.data.model.ResponseDto
import com.app.ecommerceapp.data.model.User
import com.app.ecommerceapp.data.remote.APIs
import com.app.ecommerceapp.util.navigateToMainActivity
import com.map.myapplication.models.PrefManager
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signUp_signUp_button.setOnClickListener {
            signUp()
        }


    }

    private fun signUp() {
        sign_up_progressBar.show()

        //getData
        val longitude="31.223435"
        val latitude="31.171869"
        val name= name_signUp_editText.text.toString().trim()
        val email= email_signUp_editText.text.toString().trim()
        val phone= phone_number_signUp_editText.text.toString().trim()
        val password= password_signUp_editText.text.toString().trim()
        val confirmPassword= confirm_password_signUp_editText.text.toString().trim()

        //callApi
        APIs.getApiClient().signUp(phone,email,name,longitude,latitude,password,confirmPassword)
            .enqueue(object : Callback<ResponseDto<User>> {
                override fun onResponse(
                    call: Call<ResponseDto<User>>,
                    response: Response<ResponseDto<User>>
                ) {
                    if (response.code() == 200) {
                        //saveToken
                        val prefManager= PrefManager(this@SignUpActivity)
                        prefManager.saveString(TOKEN,response.body()!!.data!!.token)
                        ///navigate
                        navigateToMainActivity()
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