package PreDefinedFunctionalInterface_Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class GenerateSystemDate {
    public static void main(String[] args) throws InterruptedException {
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());

        Thread.sleep(5000);
        System.out.println(dateSupplier.get());
    }
}
