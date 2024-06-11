package com.pace.collections.list;
import java.util.ArrayList;
public class MainEmployeeList {
	
	private static Employee employee;
	private static Object totalSalary;

	public static Object main(String[] args) {
		Employee poojitha = new Employee(1254,"Poojitha",10356.25f);
		Employee gnavika = new Employee(1568,"gnavika",20654.25f);
		Employee durga = new Employee(1984,"durga",36025.25f);
		
		ArrayList<Employee>empList = new ArrayList<Employee>();
		empList.add(poojitha);
		empList.add(gnavika);
		empList.add(durga);
		for(Employee emp : empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
}      
	for(Employee emp : empList) {
		float totalSalary = 0;
            totalSalary += employee.getSalary();
        }
        return totalSalary;
        
	}

}
