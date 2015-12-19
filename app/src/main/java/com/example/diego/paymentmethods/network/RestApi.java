package com.example.diego.paymentmethods.network;

import com.example.diego.paymentmethods.model.PaymentMethod;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;

/**
 * Created by diego on 18/12/15.
 */
public class RestApi {

    public static void getPaymentMethods( String base_url,
                                          String uri,
                                          String public_key,
                                          Callback<List<PaymentMethod>> response) {
        RestAdapter restadapter = new RestAdapter.Builder().setEndpoint(base_url).build();
        MercadoPagoApi restApi = restadapter.create(MercadoPagoApi.class);
        restApi.getPaymentMethods(uri, public_key, response);
    }

}
