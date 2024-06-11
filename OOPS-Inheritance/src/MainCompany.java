
public class MainCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee poojitha = new Employee(1452,"poojitha","Developer",24563.25f);
		Manager  gnavika = 
			new Manager(145875,"gnavika", "Tech Manager",56321.25f, 25);
		System.out.println("Employee Details");
		poojitha.showDetails();
		System.out.println("Manager Details");
		gnavika.getDetails();
		
		poojitha.computeHra();
		gnavika.computeHra();

	}

}
