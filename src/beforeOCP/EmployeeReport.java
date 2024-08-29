package beforeOCP;

public class EmployeeReport {
	public void generateReport(Employee employee) {
		if(employee.getRole().equals("Employee")) {
			System.out.println("Generating report for employee: " + employee.getName());
		}else if(employee.getRole().equals("Manager")) {
			System.out.println("Generating report for manager: " + employee.getName());
		}else {
			System.out.println("Report nof found");
		}
	}
}
