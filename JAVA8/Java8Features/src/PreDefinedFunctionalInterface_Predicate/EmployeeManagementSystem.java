package PreDefinedFunctionalInterface_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        populate(list);
        System.out.println(list.toString());


    }

    public static void populate(ArrayList<Employee> list){
        list.add(new Employee("Satish","Ceo",1000000,"Teku"));
        list.add(new Employee("Nikhil","Peon",10,"Panga"));
        list.add(new Employee("Nija","Cleaner",1,"Kuleshwor"));
    }
}
