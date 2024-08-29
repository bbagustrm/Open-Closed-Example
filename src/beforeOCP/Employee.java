package beforeOCP;

public class Employee {
	private String name;
	private String role;
	private int salary;
	
	public Employee(String name,String role, int salary) {
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRole() {
		return this.role;
	}
	
	public int getSalary() {
		return this.salary;
	}

}
