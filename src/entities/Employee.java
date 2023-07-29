package entities;

public class Employee {

	//Attributes
	private String name;
	private Double salary;
	
	//Constructors
	public Employee() {
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//Method
	public String toString() {
		return name
				+ "\n"
				+ salary;
	}
	
	
}
