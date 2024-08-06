package PreDefinedFunctionalInterface_Consumer;



import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> {System.out.println("Consumer prints the string, the string is:");
                                            System.out.println(str);
                                        };
        consumer.accept("Messi the goat");
    }
}
