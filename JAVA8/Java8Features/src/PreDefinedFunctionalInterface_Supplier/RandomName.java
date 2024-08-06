package PreDefinedFunctionalInterface_Supplier;

import java.util.function.Supplier;

public class RandomName {
    public static void main(String[] args) {
        Supplier<String> nameSupplier = () -> {
          String[] strArray ={"Sunny","Bunny","Chinny","Hunny","Funny"};
          int x = (int) (Math.random()*5); // generate a random value 0 <= x < 1
            return  strArray[x];
        };

        System.out.println(nameSupplier.get());
    }
}
