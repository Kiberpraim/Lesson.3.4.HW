package com.example.lesson34hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson34hw.adapter.TeslaAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {

    ArrayList<Tesla> arrayListTesla = new ArrayList<>();
    TeslaAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addArrayListTesla();

        adapter = new TeslaAdapter(arrayListTesla, this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }

    private void addArrayListTesla() {
        arrayListTesla.add(new Tesla("Tesla model S",R.drawable.tesla_model_s,"Deep Blue Metallic",
                " Пятидверный хетчбэк разрабатывается под прежним условным обозначением Whitestar фирменным филиалом в Детройте."
                ,"75 750 $ "));
        arrayListTesla.add(new Tesla("Tesla model 3",R.drawable.tesla_model_3,"Solid Black",
                " Model 3 была представлена 1 апреля 2016 года. Дальность поездки в базовой модели равна 350 км. Автомобиль на 20 % компактнее Model S"
                ,"35 000 $ "));
        arrayListTesla.add(new Tesla("Tesla model X",R.drawable.tesla_model_x,"Pearl White",
                " Tesla Model X разрабатывается на базе платформы Tesla Model S и собирается на основном заводе компании во Фримонте, штат Калифорния."
                ,"132 000 $ "));
        arrayListTesla.add(new Tesla("Tesla model Y",R.drawable.tesla_model_y,"Midnight Silver Metallic",
                " Машина представлена как кроссовер среднего класса, аналогичная таким машинам как VW Touareg, Nissan Murano, Lexus RX и её электрическому конкуренту под названием Audi E-tron."
                ," 38 170 $ "));
        arrayListTesla.add(new Tesla("Tesla Roadster",R.drawable.tesla_roadster,"Red Multi-Coat",
                " Tesla Roadster — четырёхместный спортивный электромобиль компании Tesla, прототип которого представлен в ноябре 2017 года и заявлен как самый быстро разгоняющийся серийный автомобиль."
                ," 200 000 $ "));

    }

    @Override
    public void onItemClick(Tesla tesla) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("tesla",tesla);
        startActivity(intent);
    }
}