package com.movies;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {
    public List<Movie> sortByRating(List<Movie> movies) {
        Comparator<Movie> compareByRating = Comparator.comparingDouble(Movie::getRating);
        Comparator<Movie> compareByName = Comparator.comparing(Movie::getName);

        return movies.stream().sorted(compareByName).collect(Collectors.toList());
    }




}
