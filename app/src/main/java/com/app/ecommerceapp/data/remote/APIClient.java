package com.app.ecommerceapp.data.remote;


import com.app.ecommerceapp.data.model.ResponseDto;
import com.app.ecommerceapp.data.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIClient {


    ///login

    @POST("login")
    @FormUrlEncoded
    Call<ResponseDto<User>> login(@Field("email") String email, @Field("password") String password);



}
