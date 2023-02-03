package com.movies;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MovieTrailerServiceTest {

    @Test
    void TestTrailerFetchException () {
        MovieTrailerGateway gateway = Mockito.mock(MovieTrailerGateway.class);
        Mockito.when(gateway.getTrailer(1)).thenReturn(new Trailer("url",1));

//        MovieTrailerService trailer = Mockito.mock(MovieTrailerService.class);
//        gateway.getTrailer(anyInt());
//        Mockito.verify(gateway).getTrailer(anyInt());
       Assertions.assertThat(gateway.getTrailer(1).getURl()).isEqualTo("url");

    }
}