package com.example.diego.paymentmethods.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.diego.paymentmethods.R;
import com.example.diego.paymentmethods.model.PaymentMethod;


import java.util.List;

public class ListViewAdapter extends ArrayAdapter<PaymentMethod> {

    public ListViewAdapter(Context context, List<PaymentMethod> paymentMethods) {
        super(context, 0, paymentMethods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        PaymentMethod paymentMethod = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_item, parent, false);
        }

        if (paymentMethod.getPayment_type_id().equalsIgnoreCase("credit_card")) {
            TextView tv = (TextView) convertView.findViewById(R.id.item1);
            tv.setText(paymentMethod.getName());
        } else {
            convertView.setVisibility(View.GONE);
        }

        return convertView;
    }
}