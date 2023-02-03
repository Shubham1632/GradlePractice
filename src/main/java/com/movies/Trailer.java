package com.movies;

public class Trailer {
    private String URl;
    private int Id;

    public Trailer(String URl, int id) {
        this.URl = URl;
        Id = id;
    }

    public String getURl() {
        return URl;
    }
}
