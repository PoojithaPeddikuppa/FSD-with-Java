import java.util.Scanner;

public class EvenIndexed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        if (array.length > 1) {
            if (array[1] % 2 != 0) {
                for (int i = 0; i < array.length; i += 2) {
                    sum += array[i];
                }
            } else {
                for (int i = 1; i < array.length; i += 2) {
                    sum += array[i];
                }
            }
        }

        System.out.println("Sum: " + sum);

    }
}
