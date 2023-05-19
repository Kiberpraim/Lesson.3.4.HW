package com.example.lesson34hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textViewName;
    ImageView imageViewImage;
    TextView textViewColor;
    TextView textViewDescription;
    TextView textViewPrice;
    Tesla tesla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tesla = (Tesla) getIntent().getSerializableExtra("tesla");

        findViews();

        setContentView();
    }

    private void setContentView() {
        textViewName.setText(tesla.getName());
        imageViewImage.setImageResource(tesla.getImage());
        textViewColor.append(tesla.getColor());
        textViewDescription.setText(tesla.getDescription());
        textViewPrice.setText(tesla.getPrice());
    }

    private void findViews() {
        textViewName = findViewById(R.id.textView_title);
        imageViewImage = findViewById(R.id.imageViewImage);
        textViewColor = findViewById(R.id.textView_color);
        textViewDescription = findViewById(R.id.textView_description);
        textViewPrice = findViewById(R.id.textView_price);
    }
}