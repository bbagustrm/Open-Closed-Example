package beforeOCP;

public class Main {
	public static void main(String[] args) {
		
		Employee person1 = new Employee("Bagus", "Employee", 500);
		Employee person2 = new Employee("Bayu", "Manager", 1000);
		
		EmployeeReport report = new EmployeeReport();
		
		report.generateReport(person1);
		report.generateReport(person2);
		
	}
}


