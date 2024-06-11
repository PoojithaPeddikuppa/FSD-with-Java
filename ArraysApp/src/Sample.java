
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=30;
		int result=0;
		System.out.println(num1+num2);
		System.out.println("Sum = "+num1+num2+"!");
		System.out.print(num1+num2+result);
		
		int i;
		i=10;
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(i);
		int x,y,z;
		x=20;
		y=1;
		z=++x + x++ + 10;
		System.out.println(x);
		z=++z - --z;
		System.out.println(z);
		System.out.println(z+ ++z);
	}
}