package afterOCP;

public class Manager implements Employee {
	private String name;
	private final int salary = 5_000_000;

	// constructor
    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Manager";
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
