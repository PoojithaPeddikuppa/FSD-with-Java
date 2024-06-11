

public class Employee {
	int id;
	String name;
	String job;
	float salary,hra;
	public Employee(int id, String name, String job, float salary) {
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	public void showDetails() {
      System.out.println(id);
      System.out.println(name);
      System.out.println(job);
      System.out.println(salary);
      }
	public void computeHra() {
		hra = salary * (20/100);
		System.out.println("Hra of Employee"+hra);
		
		
	}
}
