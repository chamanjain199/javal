package javal.java8.stream;

import javal.java.all.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmplyees();
        List<Employee> employeesSorted = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).takeWhile(x->x.getSalary()<12000).collect(Collectors.toList());
        System.out.println(employeesSorted);
    }
}
