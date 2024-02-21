package com.example.heritagetours;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    private List<City> cities;

    public CitiesAdapter(List<City> cities) {
        this.cities = cities;
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.city_item, parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        City city = cities.get(position);
        holder.nameTextView.setText(city.getName());
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }

    static class CityViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;

        CityViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_text_view);
        }
    }
}