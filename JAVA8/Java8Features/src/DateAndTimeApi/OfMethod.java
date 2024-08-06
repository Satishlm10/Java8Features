package DateAndTimeApi;

import java.time.LocalDateTime;
import java.time.Month;

public class OfMethod {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2002, Month.DECEMBER,5,21,45);
        System.out.println(dateTime);

        System.out.println("After 22 years: "+dateTime.plusYears(22));
        System.out.println("Slc passed in: "+dateTime.plusYears(16));

    }
}
