package Streams;

import java.util.ArrayList;

public class ProcessingByCountMethod {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Pawan");
        list1.add("RaviTeja");
        list1.add("Nagarjuna");
        list1.add("Chiranjeevi");
        list1.add("Venkatesh");

        System.out.println(list1);

        long count = list1.stream().filter(str->str.length()>=9).count();
        System.out.println(count);
        /*
        count() method helps us to find out how many objects will be remaining after performing the
        filtering operation
        count() method return type is long
         */

    }
}
