//GROUP 5: ClockediN: PAYROLL SYSTEM
//MEMBERS:
// Roa, Miguel Dominic E.
// Gonzales, Ian Manuel P.
// Timbol, Alyssa Louise L.
// Apostol, Lance Jezreel B.

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    private double taxRate;

    public PartTimeEmployee(String name, int employeeId, double baseSalary, 
                            double hourlyRate, int hoursWorked, double taxRate) {
        super(name, employeeId, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.taxRate = taxRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateGrossPay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateDeductions() {
        return calculateGrossPay() * taxRate;
    }

    @Override
    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeductions();
    }
}