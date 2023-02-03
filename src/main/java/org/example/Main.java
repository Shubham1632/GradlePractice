package org.example;

public class Main {

    public static void main(String[] args) {
        Director director1 = new Director("Alfonso Cuaron",12);
        Director director2 = new Director("Alajandro G Inarrity",8);

        Director [] directors = new Director[2];
        directors[0]=director1;
        directors[1]=director2;

        Genre action = new Genre("Action");
        Genre[] gener = new Genre[1];
        gener[0] = action;

        Movie movie = new Movie("Roma",directors,gener,9.8);
//
//        System.out.println(movie.name);
//        System.out.println(movie.rating);
//        System.out.println(movie.directors[0].name);

        System.out.println(movie);
    }

    public static class Movie implements Comparable<Movie>{
        protected  String name;
        Director directors[];
        Genre genre[];
        double rating;



        Movie(String name, Director directors[], Genre genre[], double rating){
            this.name=name;
            this.directors= directors;
            this.genre = genre;
            this.rating = rating;
        }

        double getRating(){
            return this.rating;
        }
        String getName(){
            return this.name;
        }
        @Override
        public int compareTo(Movie o) {
            if(this.rating > o.rating) return 1;
            else if(this.rating < o.rating) return -1;
            else return 0;
        }
    }

    public static class Director{
       String name;
       int numberOfMovies;
       public  Director(String name, int numberOfMovies){
           this.name=name;
           this.numberOfMovies = numberOfMovies;
       }
       String getName(){
           return this.name;
       }
   }
}