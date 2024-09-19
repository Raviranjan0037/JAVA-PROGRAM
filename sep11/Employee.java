package sep11;

import java.util.TreeSet;

	// Define the Employee class
public class Employee implements Comparable<Employee> {
	    private int id;
	    private String name;

	    // Constructor
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Getter methods
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    // Override toString() method for easy printing
	    @Override
	    public String toString() {
	        return "Employee{id=" + id + ", name='" + name + "'}";
	    }

	    // Implement the compareTo method for sorting
	    @Override
	    public int compareTo(Employee other) {
	        // Compare by id for sorting order
	        return Integer.compare(this.id, other.id);
	    }
}