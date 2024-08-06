package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingBySortedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(0);
        list1.add(20);
        list1.add(5);
        list1.add(15);
        list1.add(25);
        list1.add(1);

        List<Integer> list2 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> list3 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
