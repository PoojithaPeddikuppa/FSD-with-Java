import java.util.Scanner;
public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		int quotient,dividend,divisor;
		Scanner scnr = new Scanner(System.in);
		try {
			System.out.println("Enter dividend");
			dividend = scnr.nextInt();
			System.out.println("Enter divisor");
			divisor = scnr.nextInt();
			quotient = dividend / divisor;
			System.out.println("Quotient = "+ quotient);
		} catch(ArithmeticException arthexcp) {
			System.out.println( arthexcp );
			System.err.println( arthexcp.getMessage() );
			}
	}

}