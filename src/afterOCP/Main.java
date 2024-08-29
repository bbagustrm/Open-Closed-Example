package afterOCP;

public class Main {
    public static void main(String[] args) {
        Employee emp = new RegularEmployee("Bagus");
        Employee mgr = new Manager("Bayu");

        emp.generateReport();
        mgr.generateReport();
    }
}
