package com.movies;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Director> directorList = List.of(new Director("Ramesh Sippy"), new Director("Raj Sippy"));
        List<Genre> genreList = List.of(new Genre("Action"), new Genre("Drama"));
        Movie Sholey = new BollywoodMovie("Sholey",directorList, genreList, 9.5);
        System.out.println(Sholey);
        try {
            Sholey.watchTrailer();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
