package com.example.diego.paymentmethods.activity;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.example.diego.paymentmethods.R;
import com.example.diego.paymentmethods.adapter.ListViewAdapter;
import com.example.diego.paymentmethods.model.PaymentMethod;
import com.example.diego.paymentmethods.network.RestApi;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{

    private static final String BASE_URL = "https://api.mercadopago.com";
    private static final String URI = "v1/payment_methods";
    private static final String PUBLIC_KEY = "444a9ef5-8a6b-429f-abdf-587639155d88";

    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.list);

        RestApi.getPaymentMethods(BASE_URL,
                URI,
                PUBLIC_KEY,
                new Callback<List<PaymentMethod>>() {
                    @Override
                    public void success(List<PaymentMethod> paymentMethods, Response response) {
                        if (paymentMethods != null) {
                            ListViewAdapter adapter = new ListViewAdapter(getApplicationContext(), paymentMethods);
                            listView.setAdapter(adapter);
                        }
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();
                    }
                });

        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(this);
    }


    private void refreshHeader() {
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void onRefresh() {
        refreshHeader();
    }
}
