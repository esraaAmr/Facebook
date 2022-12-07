package com.example.splach_screen.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splach_screen.Models.HomeModel;
import com.example.splach_screen.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.viewHolder> {
    ArrayList<HomeModel> models;

    public HomeAdapter(ArrayList<HomeModel> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item_view,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        HomeModel homeModel = models.get(position);
       // holder.profImg.setImageResource(homeModel.getProfImg());
        holder.profName.setText(homeModel.getName());
        holder.profTime.setText(homeModel.getTime());
      //  holder.postImg.setImageResource(homeModel.getPostImg());
        holder.title.setText(homeModel.getTitle());
    }

    @Override
    public int getItemCount() {
        if (models!=null) {
            return models.size();
        }
        return 0;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView profName;
        TextView profTime;
        ImageView profImg;
        TextView title;
        ImageView postImg;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            profName = itemView.findViewById(R.id.profName);
            profTime = itemView.findViewById(R.id.profTime);
            profImg = itemView.findViewById(R.id.img_prof);
            title = itemView.findViewById(R.id.tv_status);
            postImg = itemView.findViewById(R.id.car);
        }
    }
}
