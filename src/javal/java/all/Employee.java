package javal.java.all;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee implements Comparable {

    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary) {
        super();
        this.name = name;
        this.salary = salary;

    }

    public Employee(String name, int salary, String department) {
        super();
        this.name = name;
        this.salary = salary;
        this.department = department;

    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static List<Employee> getEmplyees() {
        List<Employee> employess = new ArrayList<>();
        employess.add(new Employee("aman", 10000,"HR"));
        employess.add(new Employee("harshit", 12000,"HR"));
        employess.add(new Employee("mohit", 1300,"HR"));
        employess.add(new Employee("mohit", 1400,"DEVOPS"));

        employess.add(new Employee("kamal", 14000,"DEVOPS"));
        employess.add(new Employee("azad", 1000,"SALE"));
        employess.add(new Employee("arvind", 14200,"SALE"));
        employess.add(new Employee("aman", 12000,"SALE"));

        return employess;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(name, salary, department);
    }

    @Override
    public int compareTo(Object o) {
        Employee no=(Employee) o;
        return this.getName().compareTo(no.getName());
    }
}
