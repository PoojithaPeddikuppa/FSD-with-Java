import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < size / 2; i++) {
            int temp = originalArray[i];
            originalArray[i] = originalArray[size - 1 - i];
            originalArray[size - 1 - i] = temp;
        }

        System.out.print("Reversed Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(originalArray[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}