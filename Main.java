//GROUP 5: ClockediN: PAYROLL SYSTEM
//MEMBERS:
// Roa, Miguel Dominic E.
// Gonzales, Ian Manuel P.
// Timbol, Alyssa Louise L.
// Apostol, Lance Jezreel B.

import java.util.Scanner;

public class Main {
    private static PayrollSystem payrollSystem = new PayrollSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = getIntInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    payrollSystem.calculatePayroll();
                    break;
                case 4:
                    payrollSystem.printPayrollReport();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Thank you for using the Payroll Calculation System!");
    }

    private static void printMenu() {
        System.out.println("\n--- Payroll Calculation System ---");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Calculate Payroll");
        System.out.println("4. Print Payroll Report");
        System.out.println("5. Exit");
    }

    private static void addEmployee() {
        System.out.println("\n--- Add Employee ---");
        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.println("3. Contractual Employee");
        int type = getIntInput("Enter employee type: ");

        String name = getStringInput("Enter employee name: ");
        int id = getIntInput("Enter employee ID: ");
        double baseSalary = getDoubleInput("Enter base salary: ");

        Employee employee;
        switch (type) {
            case 1:
                double overtimeRate = getDoubleInput("Enter overtime rate: ");
                double bonusRate = getDoubleInput("Enter bonus rate: ");
                double benefitsRate = getDoubleInput("Enter benefits rate: ");
                employee = new FullTimeEmployee(name, id, baseSalary, overtimeRate, bonusRate, benefitsRate);
                break;
            case 2:
                double hourlyRate = getDoubleInput("Enter hourly rate: ");
                int hoursWorked = getIntInput("Enter hours worked: ");
                double taxRate = getDoubleInput("Enter tax rate: ");
                employee = new PartTimeEmployee(name, id, baseSalary, hourlyRate, hoursWorked, taxRate);
                break;
            case 3:
                double contractAmount = getDoubleInput("Enter contract amount: ");
                employee = new ContractualEmployee(name, id, baseSalary, contractAmount);
                break;
            default:
                System.out.println("Invalid employee type.");
                return;
        }
        payrollSystem.addEmployee(employee);
        System.out.println("Employee added successfully.");
    }

    private static void removeEmployee() {
        int id = getIntInput("Enter employee ID to remove: ");
        Employee employee = payrollSystem.getEmployee(id);
        if (employee != null) {
            payrollSystem.removeEmployee(employee);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
}