package com.pace.emp.crud.dao;
import java.util.ArrayList;
import com.pace.emp.crud.bea.Employee;
public class EmployeCrud {
	ArrayList<Employee>empList = new ArrayList<Employee>();
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	public void showEmpList() {
		for(Employee emp : empList) {
           System.out.println(emp.getId());
           System.out.println(emp.getName());
           System.out.println(emp.getSalary());
           System.out.println("====================================");
		}
	}
	//Update employees salary by 10%
	public void updateEmployee() {
		for(Employee emp: empList) {
			float salary = emp.getSalary();
			salary = salary + salary * 0.10f;
			emp.setSalary(salary);
			System.out.println("Salary has been updated");
		}
	}
	public void deleteEmployee(int id) {
		boolean isAvailable = false;
		for(Employee emp: empList) {
			if(id == emp.getId()) {
				empList.remove(emp);
				isAvailable=true;
				break;
			}
			if( isAvailable== true) {
				System.out.println("Employee with id"+id+"has been successfully deleted");
				}
			else {
				System.out.println("Employee with id"+id+"isAvailable");
			}
				
		}

		
	}
	
//before deleting the object ensure that the object is available
//if the object is not available provide an relevant message to user
//

}
