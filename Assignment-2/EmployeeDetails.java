import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int middle = size / 2;
        int sum = array[0] + array[size - 1] + array[middle];
        if (middle - 1 >= 0) sum += array[middle - 1];
        if (middle + 1 < size) sum += array[middle + 1];
        if (middle + 2 < size) sum += array[middle + 2];

        System.out.println("Sum: " + sum);

        
    }
}
