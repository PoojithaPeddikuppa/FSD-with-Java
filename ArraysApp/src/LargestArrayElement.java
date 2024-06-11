import java.util.Scanner;
public class LargestArrayElement {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//declare the array
		float marks[]=new float[5];
		for(float mark : marks) {
			System.out.println(mark);
		}
		for(int index=0;index<marks.length;index++) {
			System.out.println("Enter mark for index"+ index);
		marks[index] = scnr.nextFloat();
			
		}
		float large;
		large = marks[0];
		for(int index =1;index<marks.length;index++) {
			if(marks[index] > large){
				large =marks[index];
			}
		}
				System.out.println("largest value is" +large);
			}
}
	
		// TODO Auto-generated method stub
