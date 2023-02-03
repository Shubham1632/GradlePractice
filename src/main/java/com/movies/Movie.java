package com.movies;


import java.util.List;

public abstract class Movie {
    private String name;
    private List<Director> directorList;
    private List<Genre> genreList;
    private double rating;

    public Movie(String name, List<Director> directorList, List<Genre> genreList, double rating) {
        this.name = name;
        this.directorList = directorList;
        this.genreList = genreList;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public List<Director> getDirectorList() {
        return directorList;
    }

    public List<Genre> getGenreList() {
        return genreList;
    }

    public double getRating() {
        return rating;
    }

    abstract String countryOfOrigin();

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", directorList=" + directorList +
                ", genreList=" + genreList +
                ", rating=" + rating +
                '}';
    }
    public void watchTrailer() {
        this.getTrailer();
    }

    private void getTrailer() {
        throw new TrailerNotFoundException("Trailer Not Found");
    }
}
