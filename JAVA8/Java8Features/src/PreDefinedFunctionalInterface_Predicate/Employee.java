package PreDefinedFunctionalInterface_Predicate;

public class Employee {
    private String name;
    private String designation;
    private double salary;
    private String city;

    public Employee(String name,String designation,double salary,String city){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return  "( " +name + ","+
               designation +  ","+
                salary +","+
                 city + " )"
                ;
    }
}
