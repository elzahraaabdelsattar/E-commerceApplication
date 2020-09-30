package com.app.ecommerceapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ForgetPassword (
    @SerializedName("data")
    @Expose
    var data:String
)