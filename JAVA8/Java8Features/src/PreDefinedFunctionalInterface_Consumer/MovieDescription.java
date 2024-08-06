package PreDefinedFunctionalInterface_Consumer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieDescription {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        //populate(movieList);

        Consumer<Movie> consumer = movie -> {
            System.out.println("Movie Name: "+movie.name);
            System.out.println("Hero Name: "+movie.hero);
            System.out.println("Heroin Name: "+movie.heroin);
            System.out.println();
        };

        for(Movie movie: movieList){
            consumer.accept(movie);
        }

    }
/*
    public static void populate(ArrayList<Movie> movies){
        movies.add(new Movie("Bahubali","Prabhas","Kajal"));
        movies.add(new Movie("Kalki","Prabhas","Kajal"));
        movies.add(new Movie("Rockstar No 1","Prabhas","Kajal"));
        movies.add(new Movie("Bahubali","Prabhas","Kajal"));
        movies.add(new Movie("Bahubali","Prabhas","Kajal"));
    }

 */
}
