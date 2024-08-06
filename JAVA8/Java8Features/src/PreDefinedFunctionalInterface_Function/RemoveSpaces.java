package PreDefinedFunctionalInterface_Function;

import java.util.function.Function;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World";

        Function<String,String > f = s -> s.replaceAll(" ","");
        System.out.println(f.apply(str));

        String str2 = "Checking number of spaces in the given string";
        Function<String,Integer> f2 = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println(f2.apply(str2));
    }
}
