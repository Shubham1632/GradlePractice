package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {
    List<Main.Movie> movies;
    @BeforeEach
    void setup(){
        Main.Director director1 = new Main.Director("Prashant",12);

        Main.Director[] directors = new Main.Director[2];
        directors[0]=director1;

        Genre[] gener = new Genre[3];
        gener[0]= new Genre("Action");
        Main.Movie kgf1 = new Main.Movie("kgf",directors,gener,8.8 );
        Main.Movie kgf2 = new Main.Movie("kgf2",directors,gener,9.2 );
        Main.Movie kgf3 = new Main.Movie("kgf3",directors,gener,8.5 );
        this.movies = List.of(kgf1, kgf2, kgf3);
    }
    @Test
    void main() {
        assertEquals(1,1);
    }
    @Test
    void sort_by_rating () {
        Main.Director director1 = new Main.Director("Prashant",12);

        Main.Director[] directors = new Main.Director[2];
        directors[0]=director1;

        Genre[] gener = new Genre[1];
        gener[0]= new Genre("Drama");

        Main.Movie kgf1 = new Main.Movie("kgf",directors,gener,8.8 );
        Main.Movie kgf2 = new Main.Movie("kgf2",directors,gener,9.2 );
        Main.Movie kgf3 = new Main.Movie("kgf3",directors,gener,8.5 );
        List<Main.Movie> movies = List.of(kgf1, kgf2, kgf3);

        MovieService service = new MovieService();

        service.sortByRating(movies);
        List<Main.Movie> sortedMovies = service.sortByRating(movies);

        List<Main.Movie> expectedList = List.of(kgf1,kgf2,kgf3);
        org.assertj.core.api.Assertions.assertThat(sortedMovies).isEqualTo(expectedList);

    }
//    @Test
//    void GetMovieCount () {
//        Map<String,Long> count = MovieService.getCount(movies);
//
//        org.assertj.core.api.Assertions.assertThat(count.get("Prashant")).isEqualTo(3);
//    }

    @Test
    void GetGenreCount () {
        Genre actionOne = new Genre("Action");
        Genre actionTwo = new Genre("Action");
        Genre thriller = new Genre("Triller");
        Genre DramaOne = new Genre("Drama");
        Genre DramaTwo = new Genre("Drama");


    }


}