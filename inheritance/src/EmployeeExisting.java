public class EmployeeExisting {
	class Employee {
	    long employeeId;
	    String employeeName;
	    String employeeAddress;
	    long employeePhone;
	    double basicSalary;
	    double specialAllowance = 250.80;
	    double hra = 1000.50;

	    public Employee(long id, String name, String address, long phone, double salary) {
	        employeeId = id;
	        employeeName = name;
	        employeeAddress = address;
	        employeePhone = phone;
	        basicSalary = salary;
	    }

	    public void calculateSalary() {
	        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
	        System.out.println("Calculated salary: $" + salary);
	    }
	}

	class Manager extends Employee {
	    public Manager(long id, String name, String address, long phone, double salary) {
	        super(id, name, address, phone, salary);
	    }
	    public void calculateSalary() {
	        double transportAllowance = 15 * basicSalary / 100;
	        double totalSalary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100) + transportAllowance;
	        System.out.println("Manager's calculated salary: $" + totalSalary);
	    }
	}

	class Trainee extends Employee {
	    public Trainee(long id, String name, String address, long phone, double salary) {
	        super(id, name, address, phone, salary);
	    }
	}
}


	