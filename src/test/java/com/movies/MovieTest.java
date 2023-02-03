package com.movies;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class MovieTest {

    private Movie Sholey;
    @BeforeEach
    void setUp() {
        List<Director> directorList = List.of(new Director("Ramesh Sippy"), new Director("Raj Sippy"));
        List<Genre> genreList = List.of(new Genre("Action"), new Genre("Drama"));
        this.Sholey = new BollywoodMovie("Sholey",directorList, genreList, 9.5);
    }
    @Test
    void countryOfOrigin() {
        Assertions.assertThat(Sholey.countryOfOrigin()).isEqualTo("India");
    }

    @Test
    void namewatchTrailerExceptionTest() {
        Assertions.assertThatThrownBy(() -> {
            Sholey.watchTrailer();
        }).isInstanceOf(TrailerNotFoundException.class)
                .hasMessage("Trailer Not Found");
    }
}