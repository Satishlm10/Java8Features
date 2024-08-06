package Streams;

import java.util.ArrayList;
import java.util.Comparator;

public class ProcessingByMinAndMaxMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(10);
        list1.add(20);
        list1.add(5);
        list1.add(15);
        list1.add(25);

        Integer min = list1.stream().min(Integer::compareTo).get();
        System.out.println(min);

        Integer max = list1.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}
