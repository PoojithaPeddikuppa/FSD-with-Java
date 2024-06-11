import java.util.Scanner;
public class LargestOf10Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num,large;
		System.out.println("Enter the 1st no");
		num=scnr.nextInt();
		large = num;
		for(int count = 2; count <= 10; count++) {
			System.out.println("Enter the next no");
			num=scnr.nextInt();
			//compare with large
			if(num>large) {
				large = num;
			}
		}
		System.out.println("Largest no:"+large);
	}

}
//