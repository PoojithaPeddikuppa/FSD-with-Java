import java.util.Scanner;

public class VowelsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int vowelCount = 0;
        String lowercaseString = inputString.toLowerCase();

        for (int i = 0; i < lowercaseString.length(); i++) {
            char ch = lowercaseString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
