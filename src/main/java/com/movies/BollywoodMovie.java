package com.movies;

import java.util.List;

public class BollywoodMovie  extends  Movie{

    public BollywoodMovie(String name, List<Director> directorList, List<Genre> genreList, double rating) {
        super(name, directorList, genreList, rating);
    }
    @Override
    String countryOfOrigin() {
        return "India";
    }
}
