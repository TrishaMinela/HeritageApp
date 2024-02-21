package com.example.heritagetours;

import java.util.List;

public class City {
    private String name;
    private List<HeritageSite> heritageSites;

    public City(String name, List<HeritageSite> heritageSites) {
        this.name = name;
        this.heritageSites = heritageSites;
    }

    public int getName() {
        return 0;
    }

    // Getters and setters for name and heritageSites
}