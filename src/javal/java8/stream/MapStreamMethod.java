package javal.java8.stream;

import javal.java.all.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class MapStreamMethod {

    public static void main(String[] args) {
        List<Employee> employees=Employee.getEmplyees();
        List<Integer> salaries= employees.stream().map(x->x.getSalary()).collect(Collectors.toList());
        System.out.println(salaries);
    }
}
