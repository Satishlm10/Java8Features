package DateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println(date);

        System.out.printf("%d-%d-%d",year,month,day);
        System.out.println();
        /*
        ---------------------------------------------------------------
         */
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.println(time);

        System.out.printf("%d:%d:%d",hour,minute,second);
        /*
        --------------------------------------------------------------------
         */
        System.out.println();
        LocalDateTime dateTime = LocalDateTime.now();
        int y = dateTime.getYear();
        int m = dateTime.getMonthValue();
        int d = dateTime.getDayOfMonth();
        int hr = dateTime.getHour();
        int min = dateTime.getMinute();
        int s = dateTime.getSecond();

        System.out.printf("%d-%d-%d \n %d:%d:%d",year,month,day,hour,minute,second);
    }
}
