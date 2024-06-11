
class Employee{
    // Instance variables
    double basicSalary;
    // ... other variables

    // Constructor
    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
        // ... initialize other variables
    }

    // Method to calculate transport allowance (default 10%)
    public void calculateTransportAllowance() {
        double transportAllowance = 0.10 * basicSalary;
        System.out.println("Transport Allowance: " + transportAllowance);
    }
}

class Manager extends Employee {
    // Constructor
    public Manager(double basicSalary) {
        super(basicSalary);
    }

    // Overridden method to calculate transport allowance (15% for Manager)
    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 0.15 * basicSalary;
        System.out.println("Transport Allowance for Manager: " + transportAllowance);
    }
}

class Trainee extends Employee {
    // Constructor
    public Trainee(double basicSalary) {
        super(basicSalary);
    }

    // No need to override calculateTransportAllowance, as Trainee uses default allowance
}

public class InheritanceActivity {
    public static void main(String[] args) {
        // Test case #1: Manager
        Manager manager = new Manager(65000);
        manager.calculateTransportAllowance();

        // Test case #2: Trainee
        Trainee trainee = new Trainee(45000);
        trainee.calculateTransportAllowance();
    }
}
