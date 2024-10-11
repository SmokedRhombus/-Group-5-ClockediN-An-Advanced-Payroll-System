//GROUP 5: ClockediN: PAYROLL SYSTEM
//MEMBERS:
// Roa, Miguel Dominic E.
// Gonzales, Ian Manuel P.
// Timbol, Alyssa Louise L.
// Apostol, Lance Jezreel B.

public abstract class Employee {
    private String name;
    private int employeeId;
    private double baseSalary;

    public Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateGrossPay();
    public abstract double calculateDeductions();
    public abstract double calculateNetPay();
}