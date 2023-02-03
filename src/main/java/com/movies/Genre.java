package com.movies;

public class Genre {
    private String type;

    public String getType() {
        return type;
    }

    public Genre(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "type='" + type + '\'' +
                '}';
    }
}
