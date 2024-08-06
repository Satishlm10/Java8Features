package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExampleMap {
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
        without streams concept  I don't want to filter the objects of the collection
        but now I want to perform some operation to all the objects
        For example I want to create a new list which has the double values of objects present
        in the list1
         */
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer i : list1){
            list2.add(i*2);
        }
        System.out.println(list2);

        /*
        with streams concepts we can do the same operation with few lines of code
         */

        List<Integer> list3 = new ArrayList<>();
        list3 = list1.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(list3);

    }
}
