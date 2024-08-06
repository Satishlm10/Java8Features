package TwoArguments_Functional_Interface;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmployeeSalaryIncrement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        BiFunction<String,Double,Employee> biFunction = (name,salary) -> new Employee(name,salary);

        employees.add(biFunction.apply("Satish", 1000.0));
        employees.add(biFunction.apply("Saugat", 2000.0));
        employees.add(biFunction.apply("Nija", 3000.0));
        employees.add(biFunction.apply("Nikhil", 4000.0));

        BiConsumer<Employee,Double> biConsumer = (employee,increment) -> employee.salary = employee.salary+increment;
        System.out.println("Before increment in salary");
        for(Employee employee : employees){

            System.out.println(employee.toString());
        }
        System.out.println();
        System.out.println("After increment in salary");
        for(Employee employee : employees){

            biConsumer.accept(employee,500.0);
            System.out.println(employee.toString());
        }
    }

}
class Employee{
    String name;
    double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
