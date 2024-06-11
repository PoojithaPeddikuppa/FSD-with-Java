public class SeparateOddEvenArrays {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] odd = new int[10];
        int[] even = new int[10];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                even[evenIndex++] = original[i];
            } else {
                odd[oddIndex++] = original[i];
            }
        }

        System.out.println("Original Array: ");
        for (int value : original) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("\nOdd Array: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        System.out.println("\nEven Array: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}
