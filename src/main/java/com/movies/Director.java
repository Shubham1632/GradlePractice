package com.movies;

public class Director {
    private String name;

    public Director(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int hashCode() {
//        return Director(name);
//    }
}
