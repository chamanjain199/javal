package javal.java.java14;

import javal.java.all.Employee;

public class HelpFullNullPointerException {

	public static void main(String[] args) {
		
		Employee emp=new Employee("AA", 110);
		Employee emp1=null;
		emp1.setName(emp.getName());

	}

}
