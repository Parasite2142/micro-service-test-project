package com.example.demo.models;

import java.util.List;

public class Ratings {

    private List<Rating> ratings;

    public Ratings() {

    }

    public Ratings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }


}
