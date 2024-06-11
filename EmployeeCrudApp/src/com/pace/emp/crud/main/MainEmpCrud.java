package com.pace.emp.crud.main;
import java.util.Scanner;
import com.pace.emp.crud.bea.Employee;
import com.pace.emp.crud.dao.EmployeCrud;

public class MainEmpCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee divya = new Employee(1234,"Divya",63254.21f);
		Employee anjali = new Employee(5678,"anjali",98764.21f);
		Employee pinky = new Employee(6894,"pinky",98763.21f);
		EmployeCrud empCrud = new EmployeCrud();
		empCrud.addEmployee(divya);
		empCrud.addEmployee(anjali);
		empCrud.addEmployee(pinky);
		empCrud.showEmpList();
		System.out.println("Original empList");
		empCrud.showEmpList();
		empCrud.deleteEmployee(1234);
		System.out.println("EmpList after Deletion");
	    empCrud.updateEmployee();
	    System.out.println("EmpList after Update");
		empCrud.showEmpList();

		
		
	

	}

}
