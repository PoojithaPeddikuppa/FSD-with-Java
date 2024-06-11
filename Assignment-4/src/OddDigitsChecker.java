import java.util.Scanner;

public class OddDigitsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();

        boolean hasOnlyOddDigits = true;
        while (n > 0) {
            int digit = n % 10; 
            if (digit % 2 == 0) {    
                hasOnlyOddDigits = false;
                break;
            }
            n /= 10; 
        }

        System.out.println("Result: " + hasOnlyOddDigits);
    }
}
