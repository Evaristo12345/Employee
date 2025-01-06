package employee;
public class Trial {
    public static void main(String[] args) {
        Employee employee = new Employee("Evaristo", "Said", 123456);
        employee.setSalary(50000);
        employee.employeeSummary(); 

        Manager manager = new Manager("Said", "Evaristo", 654321, "IT");
        manager.setSalary(60000);        
        manager.employeeSummary();
    }
}