package DateAndTimeApi;

import java.time.Year;
import java.util.Scanner;

public class YearExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year to check if leap year or not.");
        int yr = input.nextInt();
        Year year = Year.of(yr);
        if(year.isLeap())
            System.out.printf("%d is leap year",yr);
        else
            System.out.printf("%d is not a leap year",yr);
    }
}
