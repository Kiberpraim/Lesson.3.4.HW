package com.example.lesson34hw.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson34hw.OnItemClick;
import com.example.lesson34hw.R;
import com.example.lesson34hw.Tesla;

import java.util.ArrayList;

public class TeslaAdapter extends RecyclerView.Adapter<TeslaViewHolder> {
    ArrayList<Tesla> adapterArrayList;
    OnItemClick adapterOnItemClick;

    public TeslaAdapter(ArrayList<Tesla> ArrayList, OnItemClick onItemClick) {
        this.adapterArrayList = ArrayList;
        this.adapterOnItemClick = onItemClick;
    }

    @NonNull
    @Override
    public TeslaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TeslaViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tesla,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TeslaViewHolder holder, int position) {
        holder.onBind(adapterArrayList.get(position));
        holder.itemView.setOnClickListener(v -> {
            adapterOnItemClick.onItemClick(adapterArrayList.get(position));
        });
    }

    @Override
    public int getItemCount() {return adapterArrayList.size();}
}
