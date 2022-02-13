package javal.java8.stream;

import javal.java.all.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class MultiMapMethod {
    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmplyees();
        List<Integer> employeesWith10 = employees.stream().<Integer>mapMulti((employee, objectConsumer)-> {

            if(employee.getSalary()>10000){
                objectConsumer.accept(employee.getSalary());  //filter and map
            }


        }).collect(Collectors.toList());
        System.out.println(employeesWith10);

        List<Integer> list1=List.of(1,2,3);
        List<Integer> list2=List.of(4,5,6);
        List<Integer> list3=List.of(7,8,9);

        List<List<Integer>> allElements=List.of(list1,list2,list3);
        List integersList= allElements.stream().<Integer>mapMulti((integers, consumer) -> {
            integers.stream().forEach(x->consumer.accept(x));  // can be used as flat map
        }).collect(Collectors.toList());

        System.out.println(integersList);

    }
}
