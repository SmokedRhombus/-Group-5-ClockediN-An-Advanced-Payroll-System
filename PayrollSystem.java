//GROUP 5: ClockediN: PAYROLL SYSTEM
//MEMBERS:
// Roa, Miguel Dominic E.
// Gonzales, Ian Manuel P.
// Timbol, Alyssa Louise L.
// Apostol, Lance Jezreel B.

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public Employee getEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void calculatePayroll() {
        for (Employee employee : employees) {
            System.out.println("Calculating payroll for: " + employee.getName());
            double grossPay = employee.calculateGrossPay();
            double deductions = employee.calculateDeductions();
            double netPay = employee.calculateNetPay();
            
            System.out.println("Gross Pay: $" + String.format("%.2f", grossPay));
            System.out.println("Deductions: $" + String.format("%.2f", deductions));
            System.out.println("Net Pay: $" + String.format("%.2f", netPay));
            System.out.println("-----------------------------");
        }
    }

    public void printPayrollReport() {
        System.out.println("Payroll Report");
        System.out.println("==============");
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getName());
            System.out.println("ID: " + employee.getEmployeeId());
            System.out.println("Base Salary: $" + String.format("%.2f", employee.getBaseSalary()));
            System.out.println("Net Pay: $" + String.format("%.2f", employee.calculateNetPay()));
            System.out.println("-----------------------------");
        }
    }
}