import java.util.Scanner;
public class MenuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scnr = new Scanner(System.in);
		int num1,num2,result=0;
		int choice;
		System.out.println("Enter 1st no:");
		num1=scnr.nextInt();
		System.out.println("Enter 2nd no:");
		num2=scnr.nextInt();
		do{
			System.out.println("Enter your choice:1.Add 2.Subtract 3.Multiply 4.Division");
			choice = scnr.nextInt();
			switch(choice) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 / num2;
				break;
			
			}
		System.out.println("Result:"+result);
		}while(choice !=5);
		
	}
}
