package DateAndTimeApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2002, Month.DECEMBER,5);
        LocalDate today = LocalDate.now();

        Period period = Period.between(birthday,today);
        System.out.printf("Age is: %d years %d months %d days",period.getYears(),period.getMonths(),period.getDays());
    }
}
