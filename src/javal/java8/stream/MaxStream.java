package javal.java8.stream;

import javal.java.all.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxStream {

    public static void main(String[] args) {
        List<Employee> employees=Employee.getEmplyees();
        Optional<Employee> maxSalariedEmployeeOp=employees.stream().max(Comparator.comparing(Employee::getSalary));
        Employee maxSalariedEmployee= maxSalariedEmployeeOp.get();
        System.out.println(maxSalariedEmployee);
    }
}
