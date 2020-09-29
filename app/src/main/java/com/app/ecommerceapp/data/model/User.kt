package com.app.ecommerceapp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class User (

    @SerializedName("id")
    @Expose
    var id: Int,

    @SerializedName("username")
    @Expose
    var username: String,

    @SerializedName("phone")
    @Expose
    var phone: String,

    @SerializedName("email")
    @Expose
    var email: String,

    @SerializedName("image")
    @Expose
    var image: String,

    @SerializedName("longitude")
    @Expose
    var longitude: String,

    @SerializedName("latitude")
    @Expose
    var latitude: String,

    @SerializedName("active")
    @Expose
    var active: Int,

    @SerializedName("token")
    @Expose
    var token: String
)