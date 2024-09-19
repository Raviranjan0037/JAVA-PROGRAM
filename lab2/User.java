package lab2;

public class User {      // create the User
	int id;             // add the attribute id ,name 
	String name;
	
	public User(int id, String name) { //Declare parameterized constructor to initialize id and name.
		
		this.id = id;
		this.name = name;
	}

	public int getId() {  // add the Setter and Getter
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Employee extends User  // create the sub class Employee and inherite the parent class
{
	double salary;  // create the attribute salary

	public Employee(int id, String name, double salary) { //Declare parameterized constructor to initialize id and name salary
		super(id,name);
		this.salary = salary;
	}

	public double getSalary() {          // Get the Salary
		return salary;
	}

	public void setSalary(double salary) { // Set the salary
		this.salary = salary;
	}
	
	
	public double calculateAnnualSalary() // Create the method calculateAnnualSalary
	{
		return salary * 12;
	}
	
    public static void main(String[] args) {  // create a  main method
		
		Employee emp = new Employee(101,"mohd salim",5000.0); //add the value
		
		
		double annualSalary = emp.calculateAnnualSalary();
        System.out.println("Id : " +emp.getId()+ " Annual Salary of " + emp.getName() + " is: " + annualSalary);
		
	}
		
}

