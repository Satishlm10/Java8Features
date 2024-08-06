package PreDefinedFunctionalInterface_Consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Movie> notificationConsumer = movie -> System.out.println("Movie: "+movie.name +" has been released");
        Consumer<Movie> hitOrFlop = movie -> System.out.println("Movie: "+movie.name+" is "+ movie.result);
        Consumer<Movie> databaseOperation = movie -> System.out.println("Movie: "+movie.name+" has been stored in database");
        Movie movie = new Movie("3Idiots","Amir Khan","Kareena Kapoor","BlockBuster");
        notificationConsumer.andThen(hitOrFlop).andThen(databaseOperation).accept(movie);
    }
}
