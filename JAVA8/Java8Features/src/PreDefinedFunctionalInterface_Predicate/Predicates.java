package PreDefinedFunctionalInterface_Predicate;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        Predicate<Integer> p1 = (i) ->
        {
            return i > 10;
        };
        System.out.println(p1.test(5));
        System.out.println(p1.test(100));


        Predicate<String > p2 = (str)->{
            return str.length()>5;
        };
        System.out.println(p2.test("abcdefghi"));
        System.out.println(p2.test("abcd"));

    }

}
