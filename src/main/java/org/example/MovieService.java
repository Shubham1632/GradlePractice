package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class MovieService {
    public List<Main.Movie> sortByRating(List<Main.Movie> movies) {
        Comparator<Main.Movie> compareByRating = Comparator.comparingDouble(Main.Movie::getRating);
        Comparator<Main.Movie> compareByName = Comparator.comparing(Main.Movie::getName);

        return movies.stream().sorted(compareByName).collect(Collectors.toList());
    }

    public static Map<String,Long> getCount(List<Main.Movie> movies) {
//        Map<String,Long> count = new HashMap<String,Long>();
//        Long one = new Long(1);
//        movies.stream().forEach(movie ->{
//            Arrays.stream(movie.directors).forEach(director -> {
//                if(count.containsKey(director.name)) count.put(director.name, one);
//                else count.put(director.name, count.get(director.name)+1);
//            });
//        });
        return  movies.stream().flatMap(movie -> Arrays.stream(movie.directors)).collect(Collectors.groupingBy(Main.Director::getName, Collectors.counting()));
    }

    public static Map<String, Long> getCountOfGenre(List<Main.Movie> movies) {
        throw new UnsupportedOperationException();
    }


}
