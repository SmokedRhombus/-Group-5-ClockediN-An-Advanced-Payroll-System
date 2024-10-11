**ClockediN: An Advanced Object-Oriented Payroll Management System**

ClockediN is a robust, object-oriented payroll management system implemented in Java. It demonstrates advanced OOP concepts while providing a flexible solution for managing different types of employees and their payroll calculations.

**Features**

- Support for multiple employee types: Full-time, Part-time, and Contractual
- CRUD operations for employee management
- Salary calculation based on employee type
- Employee filtering by salary range
- Demonstration of key OOP principles: Inheritance, Polymorphism, Encapsulation, and Abstraction

**Getting Started**

**Prerequisites**

- Java Development Kit (JDK) 8 or higher

**Installation**

1. Clone the repository:
   ```
   git clone https://github.com/SmokedRhombus/ClockediN.git
   ```
2. Navigate to the project directory:
   ```
   cd ClockediN
   ```

**Running the Application**

1. Compile the Java files:
   ```
   javac Main.java Employee.java FullTimeEmployee.java PartTimeEmployee.java ContractualEmployee.java PayrollSystem.java
   ```
2. Run the main class:
   ```
   java Main
   ```

**Usage**

Follow the on-screen menu to interact with the system. You can add employees, update their information, remove employees, display all employees, and filter employees by salary range.

**Project Structure**

- `Main.java`: Contains the main method and user interface logic
- `Employee.java`: Abstract base class for all employee types
- `FullTimeEmployee.java`: Represents full-time employees
- `PartTimeEmployee.java`: Represents part-time employees
- `ContractualEmployee.java`: Represents contractual employees
- `PayrollSystem.java`: Manages the collection of employees and provides operations

**Contributing**

Contributions are welcome! Please feel free to submit a Pull Request.

**License**

This project is open source and available under the [MIT License](LICENSE).

**Acknowledgments**

- This project was developed as part of Holy Angel University's Cybersecurity Course.
- Special thanks to Sir. John Rey Casingal for guidance and support
