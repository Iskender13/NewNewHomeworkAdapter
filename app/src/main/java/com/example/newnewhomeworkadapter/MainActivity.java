package com.example.newnewhomeworkadapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> foodlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        FoodAdapter adapter=new FoodAdapter(foodlist);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        foodlist.add("FourCheese");
        foodlist.add("Pepperoni");
        foodlist.add("Hawaii");
        foodlist.add("Margarita");
        foodlist.add("Pesto");
        foodlist.add("Kari Kari");
        foodlist.add("DoDoclassic");
    }
}