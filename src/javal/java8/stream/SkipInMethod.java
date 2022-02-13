package javal.java8.stream;

import javal.java.all.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SkipInMethod {

    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmplyees();
        List<Employee> employeesSecond = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).limit(1).collect(Collectors.toList());
        System.out.println(employeesSecond);

        List<Employee> employees1 = Employee.getEmplyees();
        List<Employee> employees1Top2 = employees1.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList());
        System.out.println(employees1Top2);
    }
}
