//GROUP 5: ClockediN: PAYROLL SYSTEM
//MEMBERS:
// Roa, Miguel Dominic E.
// Gonzales, Ian Manuel P.
// Timbol, Alyssa Louise L.
// Apostol, Lance Jezreel B.

public class ContractualEmployee extends Employee {
    private double contractAmount;

    public ContractualEmployee(String name, int employeeId, double baseSalary, double contractAmount) {
        super(name, employeeId, baseSalary);
        this.contractAmount = contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateGrossPay() {
        return contractAmount;
    }

    @Override
    public double calculateDeductions() {
        // No deductions for contractual employees
        return 0;
    }

    @Override
    public double calculateNetPay() {
        return calculateGrossPay();
    }
}