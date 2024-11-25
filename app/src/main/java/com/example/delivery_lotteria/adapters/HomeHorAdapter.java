package com.example.delivery_lotteria.adapters;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.delivery_lotteria.R;
import com.example.delivery_lotteria.models.HomeHorModel;
import com.example.delivery_lotteria.models.HomeVerModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index =-1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.chicken1, "Chicken 1", "8:00 - 22:00", "4.9", "Min - 41.000₫"));
            homeVerModels.add(new HomeVerModel(R.drawable.chicken2, "Chicken 2", "8:00 - 22:00", "4.9", "Min - 41.000₫"));
            homeVerModels.add(new HomeVerModel(R.drawable.chicken3, "Chicken 3", "8:00 - 22:00", "4.9", "Min - 41.000₫"));
            homeVerModels.add(new HomeVerModel(R.drawable.chicken4, "Chicken 4", "8:00 - 22:00", "4.9", "Min - 41.000₫"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index = position;
                    notifyDataSetChanged();

                    if(position == 0){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.chicken1, "Chicken 1","8:00 - 22:00","4.9","Min - 41.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chicken2, "Chicken 2","8:00 - 22:00","4.9","Min - 41.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chicken3, "Chicken 3","8:00 - 22:00","4.9","Min - 41.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chicken4, "Chicken 4","8:00 - 22:00","4.9","Min - 41.000₫"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position ==1){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.buger1, "Buger 1","8:00 - 22:00","4.9","Min - 49.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.buger2, "Buger 2","8:00 - 22:00","4.9","Min - 49.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.buger3, "Buger 3","8:00 - 22:00","4.9","Min - 47.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.buger4, "Buger 4","8:00 - 22:00","4.9","Min - 52.000₫"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position ==2){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.drink1, "Drink 1","8:00 - 22:00","4.9","Min - 18.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drink2, "Drink 2","8:00 - 22:00","4.9","Min - 27.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drink3, "Drink 3","8:00 - 22:00","4.9","Min - 30.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.drink4, "Drink 4","8:00 - 22:00","4.9","Min - 30.000₫"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position ==3){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.rice1, "Rice 1","8:00 - 22:00","4.9","Min - 46.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.rice2, "Rice 2","8:00 - 22:00","4.9","Min - 46.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.rice3, "Rice 3","8:00 - 22:00","4.9","Min - 46.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.rice4, "Rice 4","8:00 - 22:00","4.9","Min - 46.000₫"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position ==4){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Fries 1","8:00 - 22:00","4.9","Min - 27.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Fries 2","8:00 - 22:00","4.9","Min - 28.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Fries 3","8:00 - 22:00","4.9","Min - 32.000₫"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Fries 4","8:00 - 22:00","4.9","Min - 28.000₫"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);

                }
            }
        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
