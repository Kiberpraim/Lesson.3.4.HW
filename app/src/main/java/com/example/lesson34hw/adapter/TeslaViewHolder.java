package com.example.lesson34hw.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson34hw.R;
import com.example.lesson34hw.Tesla;

public class TeslaViewHolder extends RecyclerView.ViewHolder {
    TextView textViewName;
    ImageView imageViewImage;
    TextView textViewColor;
    TextView textViewDescription;
    TextView textViewPrice;

    public TeslaViewHolder(@NonNull View itemView) {super(itemView);}

    public void onBind(Tesla tesla) {
        textViewName = itemView.findViewById(R.id.textView_title);
        imageViewImage = itemView.findViewById(R.id.imageViewImage);
        textViewDescription = itemView.findViewById(R.id.textView_description);
        textViewColor = itemView.findViewById(R.id.textView_color);
        textViewPrice = itemView.findViewById(R.id.textView_price);

        textViewName.setText(tesla.getName());
        imageViewImage.setImageResource(tesla.getImage());
        textViewDescription.setText(tesla.getDescription());
        textViewColor.setText(tesla.getColor());
        textViewPrice.setText(tesla.getPrice());
    }
}
