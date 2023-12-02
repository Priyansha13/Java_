import java.util.ArrayList;

class Employee{
    private int employeeId;
    private String employeeName;
    private String designation;

    // Defining Constructor
    public Employee(int employeeId, String employeeName, String designation){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
    }

    // methods for setting and retrieving attributes
    public int getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getDesignation(){
        return designation;
    }

    //Displaying employee information
    public void displayInfo(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
    }

    public double calculateBonus(){
        return 0.10; //10% bonus
    }

    // method to calculate annual earnings
    public void displayAnnualEarnings() {
        double annualEarnings = calculateWeeklySalary() * 52; // Assuming 52 weeks in a year
        System.out.println("Annual Earnings: $" + annualEarnings);
    }

    //method for calculating weekly salary
    public double calculateWeeklySalary() {
        return 0;
    }

}

// Derived class for hourly employees
class HourlyEmployee extends Employee {
    // Additional attributes
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public HourlyEmployee(int employeeId, String employeeName, String designation,
                          double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, designation);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateWeeklySalary(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateBonus(){
        return super.calculateBonus() + 0.04; //Additional 4%
    }

}

//Derived class for salaried employees
class SalariedEmployee extends Employee{
    private double monthlySalary;

    //Constructor
    public SalariedEmployee(int employeeId, String employeeName, String designation,double monthlySalary){
        super(employeeId, employeeName, designation);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public double calculateWeeklySalary(){
        return monthlySalary/4;
    }

    @Override
    public double calculateBonus(){
        return super.calculateBonus() + 0.06; //Additional 6%
    }

}

//Derived class for executive employees
class ExecutiveEmployee extends SalariedEmployee{
    private double bonusPercentage;

    //Constructor
    public ExecutiveEmployee(int employeeId, String employeeName, String designation, double monthlySalary, double bonusPercentage){
        super(employeeId, employeeName, designation, monthlySalary);
        this.bonusPercentage = bonusPercentage;
    }
    @Override
    public double calculateBonus(){
        return super.calculateBonus() + (super.calculateWeeklySalary() * bonusPercentage);
    }
}

class PayrollSystem{
    private ArrayList<Employee> employees = new ArrayList<>();
    // to store employees

    // to add an employee to Payroll
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    // Method to get the list of employees
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public void displayTotalPayroll(){
        double totalPayroll = 0;
        for (Employee employee : employees){
            totalPayroll += employee.calculateWeeklySalary();
        }
        System.out.println("Total Payroll: $" + totalPayroll);
    }

}

public class Main{
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee(1, "Jane Doe", "Assistant", 20.0, 40);
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Joohn Doe", "Manager", 4000.0);
        ExecutiveEmployee executiveEmployee = new ExecutiveEmployee(3, "Justin", "Executive", 8000.0, 0.15);

        PayrollSystem payrollSystem = new PayrollSystem();

        // Add employees to the payroll system
        payrollSystem.addEmployee(hourlyEmployee);
        payrollSystem.addEmployee(salariedEmployee);
        payrollSystem.addEmployee(executiveEmployee);

        // Display employee information and total payroll
        for (Employee employee : payrollSystem.getEmployees()) {
            employee.displayInfo();
            System.out.println("Weekly Salary: $" + employee.calculateWeeklySalary());
            System.out.println("Bonus: $" + employee.calculateBonus());
            employee.displayAnnualEarnings();
        }

        // Display total payroll
        payrollSystem.displayTotalPayroll();
    }
}

