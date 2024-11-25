package com.example.delivery_lotteria.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delivery_lotteria.R;
import com.example.delivery_lotteria.adapters.HomeHorAdapter;
import com.example.delivery_lotteria.adapters.HomeVerAdapter;
import com.example.delivery_lotteria.adapters.UpdateVerticalRec;
import com.example.delivery_lotteria.databinding.FragmentHomeBinding;
import com.example.delivery_lotteria.databinding.HomeHorizontalItemBinding;
import com.example.delivery_lotteria.models.HomeHorModel;
import com.example.delivery_lotteria.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec, homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;


    //////VERTICAL///////////
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeHorizontalRec =root.findViewById(R.id.home_hor_rec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);

        ////////////////////Horizontal RecyclerView
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.chicken,"Chicken"));
        homeHorModelList.add(new HomeHorModel(R.drawable.buger,"Buger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.drink,"Drink"));
        homeHorModelList.add(new HomeHorModel(R.drawable.rice,"Rice"));
        homeHorModelList.add(new HomeHorModel(R.drawable.snack,"Fries"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);



        ////////////////////Vertical RecyclerView
        homeVerModelList = new ArrayList<>();

//        homeVerModelList.add(new HomeVerModel(R.drawable.chicken1, "Chicken","8:00 - 22:00","4.9","Min - 41.000₫" ));
//        homeVerModelList.add(new HomeVerModel(R.drawable.chicken2, "Chicken","8:00 - 22:00","4.9","Min - 41.000₫" ));
//        homeVerModelList.add(new HomeVerModel(R.drawable.chicken3, "Chicken","8:00 - 22:00","4.9","Min - 41.000₫" ));

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
//        homeVerticalRec.setHasFixedSize(true);
//        homeVerticalRec.setNestedScrollingEnabled(false);
        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {
        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
//    }
}