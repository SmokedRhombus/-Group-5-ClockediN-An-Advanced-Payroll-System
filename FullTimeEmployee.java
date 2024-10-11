//GROUP 5: ClockediN: PAYROLL SYSTEM
//MEMBERS:
// Roa, Miguel Dominic E.
// Gonzales, Ian Manuel P.
// Timbol, Alyssa Louise L.
// Apostol, Lance Jezreel B.

public class FullTimeEmployee extends Employee {
    private double overtimeRate;
    private double bonusRate;
    private double benefitsRate;

    public FullTimeEmployee(String name, int employeeId, double baseSalary, 
                            double overtimeRate, double bonusRate, double benefitsRate) {
        super(name, employeeId, baseSalary);
        this.overtimeRate = overtimeRate;
        this.bonusRate = bonusRate;
        this.benefitsRate = benefitsRate;
    }

    public double calculateOvertime() {
        // Assuming overtime is 10% of base salary for this example
        return getBaseSalary() * 0.1 * overtimeRate;
    }

    public double calculateBonus() {
        // Assuming bonus is 5% of base salary for this example
        return getBaseSalary() * 0.05 * bonusRate;
    }

    public double calculateBenefits() {
        return getBaseSalary() * benefitsRate;
    }

    @Override
    public double calculateGrossPay() {
        return getBaseSalary() + calculateOvertime() + calculateBonus();
    }

    @Override
    public double calculateDeductions() {
        // Assuming tax rate of 20% and including benefits
        return (calculateGrossPay() * 0.2) + calculateBenefits();
    }

    @Override
    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeductions();
    }
}