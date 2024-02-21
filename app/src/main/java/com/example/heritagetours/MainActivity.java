package com.example.heritagetours;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText searchBar;
    private Button mapOption;
    private RecyclerView citiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBar = findViewById(R.id.search_bar);
        mapOption = findViewById(R.id.map_option);
        citiesList = findViewById(R.id.cities_list);

        List<City> cities = new ArrayList<>();
        // Add cities with heritage sites to the list
        citiesList.setLayoutManager(new LinearLayoutManager(this));
        citiesList.setAdapter(new CitiesAdapter(cities));

        mapOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle map option click
            }
        });
    }
}