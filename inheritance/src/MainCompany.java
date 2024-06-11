
import inheritance.Manager;

public class Maincompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee poojitha = new Employee(1452,"Poojitha","Developer",24563.25f);
		Manager peddikuppapoojitha = new Manager(145875,"Peddikuppapoojitha","Tech Manager",56321.25f,25);
		System.out.println("Employee Details");
		poojitha.showDetails();
		System.out.println("Manager Details");
		peddikuppapoojitha.showDetails();
		poojitha.computeHra();
		peddikuppapoojitha.computeHra();

	}

}
//same method signature in super class and sub class with different business logic in super class and also in sub class - method overriding
//example : employee hra 20% and manager hra is 40%