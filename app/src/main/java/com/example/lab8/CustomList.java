package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {

    private ArrayList<City> cities;

    public CustomList(ArrayList<City> cities) {
        this.cities = cities;
    }

    public int getCount(){
        return cities.size();
    }


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city){
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List getCities() {
        List list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns a boolean if we have a city or not
     * @param city
     * @return
     * Returns a boolean
     */
    public boolean hasCity(City city) {
        for (City cityL : cities) {
            if (cityL.getCityName() == city.getCityName() && cityL.getProvinceName() == city.getProvinceName()) {
                return true;
            }
        }
        return false;
    }
}