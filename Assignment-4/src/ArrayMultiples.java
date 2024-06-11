import java.util.Scanner;
public class ArrayMultiples {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 integer elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scnr.nextInt();
        }

        System.out.print("Enter a value for 'n': ");
        int n = scnr.nextInt();

        boolean foundMultiple = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] % n == 0) {
                foundMultiple = true;
                break;
            }
        }

        if (foundMultiple) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
