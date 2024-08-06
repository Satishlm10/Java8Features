package PreDefinedFunctionalInterface_Function;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentGrade {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        populate(list);
        Function<Student,String> f = student -> {
            int marks = student.marks; {
                if (marks >= 80){
                    System.out.println(student.getName());
                    return "A[Distinction]";}
                else if (marks >= 60){
                    System.out.println(student.getName());
                    return "B[First Division]";}
                else if (marks >= 50){
                    System.out.println(student.getName());
                    return "C[Second Division]";}
                else if (marks >= 40){
                    System.out.println(student.getName());
                    return "D[Third Division]";}
                else{
                    System.out.println(student.getName());
                    return "F[Failed]";}

            }
        };

        for (Student student : list){
            System.out.println(student.marks);
            System.out.println(f.apply(student));
        }

    }
    public static void populate(ArrayList<Student> list){
        list.add(new Student("Sunny",100));
        list.add(new Student("Bunny",65));
        list.add(new Student("Hunny",55));
        list.add(new Student("Funny",45));
        list.add(new Student("Yunny",35));
    }
}
