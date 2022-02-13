package javal.java8.stream;

import javal.java.all.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class PeekMethod {
    public static void main(String[] args) {
        List<Employee> employees=Employee.getEmplyees();
        employees.stream().peek(x->System.out.println(x)).collect(Collectors.toList());
    }
}
