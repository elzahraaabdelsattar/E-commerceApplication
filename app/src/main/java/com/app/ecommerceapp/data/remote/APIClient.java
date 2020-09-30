package com.app.ecommerceapp.data.remote;


import com.app.ecommerceapp.data.model.ForgetPassword;
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

    ///login

    @POST("register")
    @FormUrlEncoded
    Call<ResponseDto<User>> signUp(@Field("phone") String phone, @Field("email") String email,@Field("username") String username,
                                   @Field("longitude") String longitude,@Field("latitude") String latitude,
                                   @Field("password") String password,@Field("re_password") String re_password);

    ///ForgetPassword

    // reset password
    @POST("password/create")
    @FormUrlEncoded
    Call<ResponseDto<ForgetPassword>> resetPassword(@Field("email") String email);



}
