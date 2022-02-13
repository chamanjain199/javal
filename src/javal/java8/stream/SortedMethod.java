package javal.java8.stream;

import javal.java.all.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 3, 2, 6, 3, 2, 6, 8, 9, 10);
        List<Integer> integersSorted = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(integersSorted);


        List<Employee> employees = Employee.getEmplyees();
        List<Employee> employeesSorted = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(employeesSorted);

    }
}
