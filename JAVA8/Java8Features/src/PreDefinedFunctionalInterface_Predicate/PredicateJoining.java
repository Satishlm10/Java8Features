package PreDefinedFunctionalInterface_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        /*
        1. check an input is greater than 10?
        2. check an input is even or not?
        3. check an input is not greater than 10?
         */

        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i%2 == 0;

        System.out.println("50 is greater than 10 and a even number: "+p1.and(p2).test(50));
        System.out.println("7 is greater than 10 and  a even number: "+p1.and(p2).test(7));

        System.out.println("71 is greater than 10 or an even number: "+p1.or(p2).test(71));
        System.out.println("5 is greater than 10 or an even number: "+p1.or(p2).test(5));

        System.out.println("50 is not greater than 10: "+p1.negate().test(50));
        System.out.println("5 is not greater than 10: "+p1.negate().test(5));

        String[] str = {"Sam","John","Sat","Magne","Sita","Ram"};
        Predicate<String> p3 = s -> s.charAt(0) == 'S';
        System.out.println("Name that starts with S are: ");
        for(String s:str){
            if (p3.test(s))
                System.out.println(s);
        }

        String[] str2 = {"Sam","John","","Magne","Sita","Ram",null};
        System.out.println("List of string with null and empty string: "+ Arrays.toString(str2));
        Predicate<String> p4 = s -> s != null && !s.isEmpty();
        ArrayList<String> al = new ArrayList<>();

        for (String s : str2){
            if(p4.test(s))
                al.add(s);
        }
        System.out.println("List of string without null and empty string: "+ al);
    }
}
