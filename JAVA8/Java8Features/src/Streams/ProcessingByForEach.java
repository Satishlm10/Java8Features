package Streams;

import java.util.ArrayList;

public class ProcessingByForEach {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("BB");
        list1.add("CCC");

        list1.stream().forEach(str-> System.out.println(str));
        System.out.println();
        list1.stream().forEach(System.out::println);
        System.out.println();
        list1.forEach(System.out::println);
    }
}
