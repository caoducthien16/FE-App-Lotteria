package com.example.delivery_lotteria.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delivery_lotteria.R;
import com.example.delivery_lotteria.adapters.DetailedDailyAdapter;
import com.example.delivery_lotteria.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList= new ArrayList<>();
        dailyAdapter=new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("chickencombo")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ckcb1,"Chicken Combo", "description","4.4","95","8:00 - 22:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ckcb2,"Chicken Combo", "description","4.4","87","8:00 - 22:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.ckcb3,"Chicken Combo", "description","4.4","95","8:00 - 22:00"));
            dailyAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("bestseller")) {
            imageView.setImageResource(R.drawable.bestseller);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.best1, "Best Seller ", "description", "4.4", "145", "8:00 - 22:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.best2, "Best Seller", "description", "4.4", "220", "8:00 - 22:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.best3, "Best Seller", "description", "4.4", "87", "8:00 - 22:00"));
            dailyAdapter.notifyDataSetChanged();

        }
////        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
////            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
////            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
////            return insets;
//        });

    }
}