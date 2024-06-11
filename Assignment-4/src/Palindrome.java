import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scnr.nextLine().toLowerCase(); 
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Given string is a palindrome.");
        } else {
            System.out.println("Given string is not a palindrome.");
        }
    }
}
