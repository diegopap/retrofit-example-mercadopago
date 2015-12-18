package com.example.diego.network;


import com.example.diego.model.PaymentMethod;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by diego on 17/12/15.
 */
public interface api {

    @GET("/{path}")
    public void getPaymentMethods(@Path (value = "path", encode = false) String path, @Query("public_key") String public_key, Callback<List<PaymentMethod>> response);


}
