
public class Manager extends Employee {
	int teamSize;
	public Manager(int id, String name, String job, float salary,int teamSize) {
		super(id, name, job, salary);
		this.teamSize = teamSize;
		// TODO Auto-generated constructor stub
	}
	public void getDetails() {
		this.showDetails();
		System.out.println(teamSize);
	}
	public void computeHra() {
		hra = salary * 40/100;
		System.out.println("Hra of Manager " + hra);
		
	}

	
}
