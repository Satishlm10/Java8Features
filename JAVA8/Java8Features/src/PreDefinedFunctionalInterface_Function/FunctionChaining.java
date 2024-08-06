package PreDefinedFunctionalInterface_Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String,String> f1 = str -> str.toUpperCase();
        Function<String,String> f2 = str -> str.substring(0,9);

        String str = "Function Chaining Example";
        System.out.println(f1.apply(str));
        System.out.println(f2.apply(str));

        System.out.println(f1.andThen(f2).apply(str));
        System.out.println(f1.compose(f2).apply(str));
    }
}
