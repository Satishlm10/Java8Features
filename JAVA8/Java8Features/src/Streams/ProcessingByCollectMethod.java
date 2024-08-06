package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingByCollectMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Pawan");
        list1.add("RaviTeja");
        list1.add("Nagarjuna");
        list1.add("Chiranjeevi");
        list1.add("Venkatesh");

        System.out.println(list1);

        // collect method collects the stream object after filtering or mapping to the specifies collection

        List<String> list2 = list1.stream().filter(str->str.length()>=9).collect(Collectors.toList());
        System.out.println(list2);

        List<String> list3 = list1.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println(list3);

        /*
        collect() method helps to collect the filtered or mapped object to the specified collection after
        the filter or map operation to the original  collection
         */
    }
}
