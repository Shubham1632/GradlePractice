package com.movies;

import java.util.List;

public class HollywoodMovie extends Movie{

    public HollywoodMovie(String name, List<Director> directorList, List<Genre> genreList, double rating) {
        super(name, directorList, genreList, rating);
    }

    @Override
    String countryOfOrigin() {
        return "USA";
    }
}
