package com.example.delivery_lotteria.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delivery_lotteria.R;
import com.example.delivery_lotteria.adapters.DailyMealAdapter;
import com.example.delivery_lotteria.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

//import com.example.delivery_lotteria.databinding.FragmentGalleryBinding;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.chickencombo,"Chicken Combo","10% OFF","Description Description","chickencombo"));
        dailyMealModels.add(new DailyMealModel(R.drawable.bestseller,"Best Seller","10% OFF","Description Description","bestseller"));
        dailyMealModels.add(new DailyMealModel(R.drawable.khuyenmai,"Khuyen Mai","30% OFF","Description Description","khuyenmai"));
        dailyMealModels.add(new DailyMealModel(R.drawable.combobuger,"Combo Buger","10% OFF","Description Description","combobuger"));
        dailyMealModels.add(new DailyMealModel(R.drawable.combonhom,"Combo Nhom","10% OFF","Description Description","combonhom"));
        dailyMealModels.add(new DailyMealModel(R.drawable.value,"Value","10% OFF","Description Description","value"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }
}

