package afterOCP;

public class RegularEmployee implements Employee {
	private String name;
	private final int salary = 2_000_000;

	//constructor
    public RegularEmployee(String name) {
        this.name = name;
    }
    
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Employee";
    }
    
    @Override
    public int getSalary() {
    	return this.salary;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for employee: " + name);
    }
}
