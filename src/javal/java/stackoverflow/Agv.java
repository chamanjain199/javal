package javal.java.stackoverflow;

import java.util.*;
import java.util.stream.Collectors;

public class Agv {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(1, "Jiya Brein", "4000", "HR");
        Employee emp2 = new Employee(2, "Paul Niksui", "2000", "IT");
        Employee emp3 = new Employee(3, "Martin Theron", "5000", "HR");
        Employee emp4 = new Employee(4, "Murali Gowda", "6000", "IT");
        Employee emp5 = new Employee(5, "Jacob Arthur", "8000", "HR");
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);


        String avgSalaryOfDepartments = employees.stream().collect(
                Collectors.groupingBy(Employee::departmentName,
                        Collectors.averagingDouble(emp->Double.parseDouble(emp.salary())))).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(avgSalaryOfDepartments);

       String ss= employees.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.groupingBy(Employee::departmentName,
                                Collectors.averagingDouble(emp->Double.parseDouble(emp.salary()))),
                        (map)->map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey()
                )
        );

        System.out.println(ss);
        Long collect = employees.stream().collect(Collectors.filtering(x -> Double.parseDouble(x.salary()) > 4000, Collectors.counting()));
        System.out.println(collect);

       List<String> names= employees.stream().collect(Collectors.mapping(x->x.name(),Collectors.toList()));
        System.out.println(names);
        Optional<Employee> amx= employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::salary)));
        System.out.println(amx);
        Map<Boolean, List<Employee>> partition= employees.stream().collect(Collectors.partitioningBy(x->Double.parseDouble(x.salary())>4000));

        System.out.println(partition);
 System.out.println(employees.stream().collect(Collectors.partitioningBy(x->Double.parseDouble(x.salary())>4000,Collectors.mapping(x->x.name(),Collectors.toList()))));



    }
}
