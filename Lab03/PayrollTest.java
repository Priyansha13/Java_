public class PayrollTest {

    public static void main(String[] args) {
        // Instantiate objects
        HourlyEmployee hourlyEmployee = new HourlyEmployee(1, "Jane Doe", "Assistant", 20.0, 40);
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "John Doe", "Manager", 4000.0);
        ExecutiveEmployee executiveEmployee = new ExecutiveEmployee(3, "Justin", "Executive", 8000.0, 0.15);

        // Displaying information
        System.out.println("Hourly Employee Details:");
        displayEmployeeDetails(hourlyEmployee);

        System.out.println("\nSalaried Employee Details:");
        displayEmployeeDetails(salariedEmployee);

        System.out.println("\nExecutive Employee Details:");
        displayEmployeeDetails(executiveEmployee);

        displayTotalPayroll(hourlyEmployee, salariedEmployee, executiveEmployee);
    }

    private static void displayEmployeeDetails(Employee employee) {

        // Display general information
        employee.displayInfo();

        // Display specific information for each employee type
        System.out.println("Weekly Salary: $" + employee.calculateWeeklySalary());
        System.out.println("Bonus: $" + employee.calculateBonus());
        employee.displayAnnualEarnings();
    }

        private static void displayTotalPayroll(Employee... employees) {
        PayrollSystem payrollSystem = new PayrollSystem();

        // Adding employees to the payroll system
        for (Employee employee : employees) {
            payrollSystem.addEmployee(employee);
        }

        payrollSystem.displayTotalPayroll();
    }
}
