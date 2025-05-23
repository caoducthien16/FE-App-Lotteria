package com.example.delivery_lotteria.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.delivery_lotteria.R;
import com.example.delivery_lotteria.adapters.FeaturedAdapter;
import com.example.delivery_lotteria.adapters.FeaturedVerAdapter;
import com.example.delivery_lotteria.models.FeaturedModel;
import com.example.delivery_lotteria.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {

    ///////////// Featured Hor RecycleView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    ///////////// Featured Ver RecycleView
    List<FeaturedVerModel> featuredVerModelsList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        ///////////// Featured Hor RecycleView

        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelsList = new ArrayList<>();

        featuredModelsList.add(new FeaturedModel(R.drawable.tab1,"Featured 1","Description 1" ));
        featuredModelsList.add(new FeaturedModel(R.drawable.tab2,"Featured 2","Description 2" ));
        featuredModelsList.add(new FeaturedModel(R.drawable.tab3,"Featured 3","Description 3" ));

        featuredAdapter =new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);


        ///////////// Featured Ver RecycleView

        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelsList = new ArrayList<>();

        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.tab1,"Featured 1","Description 1","4.8","8:00 - 22:00" ));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.tab2,"Featured 2","Description 2","4.8","8:00 - 22:00" ));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.tab3,"Featured 3","Description 3","4.8","8:00 - 22:00" ));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.tab1,"Featured 1","Description 1","4.8","8:00 - 22:00" ));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.tab2,"Featured 2","Description 2","4.8","8:00 - 22:00" ));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.tab3,"Featured 3","Description 3","4.8","8:00 - 22:00" ));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelsList);
        recyclerView2.setAdapter(featuredVerAdapter);


        return view;
    }
}