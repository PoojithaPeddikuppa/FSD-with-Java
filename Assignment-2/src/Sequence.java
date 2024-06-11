import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] input = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }
        
        boolean sequenceFound = false;
        for (int i = 0; i < input.length - 2; i++) {
            if (input[i] == 1 && input[i + 1] == 2 && input[i + 2] == 3) {
                sequenceFound = true;
                break;
            }
        }
        
        System.out.println(sequenceFound);
    }
}
