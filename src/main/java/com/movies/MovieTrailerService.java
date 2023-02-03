package com.movies;

public class MovieTrailerService {
    private final MovieTrailerGateway TrailerGateway;
    public MovieTrailerService(MovieTrailerGateway TrailerGateway) {
        this.TrailerGateway = TrailerGateway;
    }
    public Trailer fetchTrailer(int id){
        return this.TrailerGateway.getTrailer(1);
    }
}
