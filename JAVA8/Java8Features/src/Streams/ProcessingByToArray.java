package Streams;

import java.util.ArrayList;
import java.util.List;

public class ProcessingByToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(10);
        list1.add(20);
        list1.add(5);
        list1.add(15);
        list1.add(25);
        System.out.println(list1);
        Integer[] list2 = list1.stream().toArray(Integer[]::new);
        for(Integer x:list2){
            System.out.println(x);
        }
    }
}
