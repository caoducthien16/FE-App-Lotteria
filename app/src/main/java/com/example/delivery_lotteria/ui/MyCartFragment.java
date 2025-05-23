package com.example.delivery_lotteria.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.delivery_lotteria.R;
import com.example.delivery_lotteria.adapters.CartAdapter;
import com.example.delivery_lotteria.models.CartModel;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {
    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;


    public MyCartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.chicken, "Order 1", "30", "4.3"));
        list.add(new CartModel(R.drawable.chicken, "Order 2", "30", "4.3"));
        list.add(new CartModel(R.drawable.chicken, "Order 3", "30", "4.3"));
        list.add(new CartModel(R.drawable.chicken, "Order 1", "$20", "4.3"));
        list.add(new CartModel(R.drawable.chicken, "Order 2", "$20", "4.3"));
        list.add(new CartModel(R.drawable.chicken, "Order 3", "$40", "4.3"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);


        return view;
    }
}