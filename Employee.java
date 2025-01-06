package employee;
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary; 

    public Employee(String firstName, String lastName, int employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salary = 0.0; // Initialize salary to zero
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void employeeSummary() {
        System.out.println("Employee Summary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}