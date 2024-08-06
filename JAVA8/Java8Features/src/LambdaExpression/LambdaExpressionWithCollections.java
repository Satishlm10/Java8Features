package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class LambdaExpressionWithCollections {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);
        System.out.println("Before sorting: "+l);

        Collections.sort(l);
        System.out.println("Default sorting order: "+l); // Ascending order

        Collections.sort(l, new myComparator());
        System.out.println("Custom sorting order: "+l); // Descending order

        // using lambda expression
        Collections.sort(l,(I1,I2)->(I1 > I2) ? -1 : (I1 < I2) ? +1 : 0);
        System.out.println("Custom sorting order using Lamda Expression: "+l); // Descending order
    }
}

class myComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 > o2) ? -1 : (o1 < o2) ? +1 : 0;
    }
}