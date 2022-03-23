package javal.java8.stream.collector;

import javal.java.all.Employee;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reducing {
    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmplyees();
        Employee master=new Employee();
        int sum= employees.stream().reduce(0,(integer, employee) -> integer+employee.getSalary(),(integer, integer2) -> integer+integer2);

        System.out.println(sum);
        employees.stream().reduce(master,(employee, employee2) -> {
            employee.setSalary(employee.getSalary() + employee2.getSalary());
            return employee;

        });
        System.out.println(master);


        Optional<Employee> emp=employees.stream().reduce((employee, employee2) -> {
            employee.setSalary(employee.getSalary() + employee2.getSalary());
            return employee;
        });

        System.out.println(emp.get());







    }
}
