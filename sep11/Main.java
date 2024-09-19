package sep11;

import java.util.TreeSet;

public class Main {
	    public static void main(String[] args) {
	        // Create a TreeSet of Employee objects
	        TreeSet<Employee> employeeSet = new TreeSet<>();

	        // Add employees to the TreeSet
	        employeeSet.add(new Employee(3, "Alice"));
	        employeeSet.add(new Employee(1, "Bob"));
	        employeeSet.add(new Employee(2, "Charlie"));

	        // Print the TreeSet
	        for (Employee emp : employeeSet) {
	            System.out.println(emp);
	        }
	    }
}