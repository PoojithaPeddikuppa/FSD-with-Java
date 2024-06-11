import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend, divisor, quotient;

        System.out.print("Enter the dividend: ");
        dividend = scanner.nextInt();

        while (true) {
            System.out.print("Enter the divisor: ");
            divisor = scanner.nextInt();

            try {
                quotient = dividend / divisor;
                System.out.println("The quotient is: " + quotient);
                break; 
            } catch (ArithmeticException e) {
                System.out.println("Divisor cannot be zero. Please re-enter the divisor.");
            }
        }

    }
}
