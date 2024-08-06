package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExampleFilter {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(10);
        list1.add(20);
        list1.add(5);
        list1.add(15);
        list1.add(25);
        System.out.println(list1);
        /*
            Without the knowledge of streams concepts i want to process the objects of
            the collection list1 such that only the even intergers are copied to
            another arraylist
         */

        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer i : list1){
            if(i%2==0)
                list2.add(i);
        }
        System.out.println(list2);

        /*
            with the knowledge of streams we can process the objects of the collection with ease and
            very few lines of code
         */

        List<Integer> list3 = new ArrayList<>();
        list3 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list3);
    }
}
