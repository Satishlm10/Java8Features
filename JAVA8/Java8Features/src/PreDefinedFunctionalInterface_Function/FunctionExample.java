package PreDefinedFunctionalInterface_Function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        String str = "Hello";
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply(str));
        System.out.println(f.apply("Hello worldR"));
    }
}
