package com.app.ecommerceapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseDto<T> (

    @SerializedName("success")
    @Expose
    var success: Boolean,
    @SerializedName("message")
    @Expose
    var message: String,
    @SerializedName("error")
    @Expose
    var error: String,
    @SerializedName("data")
    @Expose
    var data: T?
)