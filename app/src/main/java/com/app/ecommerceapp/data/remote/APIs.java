package com.app.ecommerceapp.data.remote;

import com.app.ecommerceapp.core.Const;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIs {

    private static APIClient apiClient;

    private APIs(){}

    public static synchronized APIClient getApiClient() {
        if(apiClient == null)
        {
            apiClient = new Retrofit.Builder()
                    .baseUrl(Const.API_HOST)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(APIClient.class);

            return apiClient;
        }
        else
            return apiClient;
    }
}
