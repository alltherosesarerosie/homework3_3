package com.geektech.homework3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView rvFood;
    public ArrayList<String> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.recycle_view);
        loadData();
        FoodAdapter adapter = new FoodAdapter(foodList);
        rvFood.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("Lagman");
        foodList.add("Manty");
        foodList.add("Plov");
        foodList.add("Besh barmak");
        foodList.add("Oromo");
        foodList.add("Ramen");
        foodList.add("Grenki");
        foodList.add("Samsy");
    }
}