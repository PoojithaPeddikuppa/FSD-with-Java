public class EvenIndexed {
    public static void main(String[] args) {
        int[] array = { };
        int sum = 0;
        if (array[1] % 2 != 0) {
            for (int i = 0; i < array.length; i += 2) {
                sum += array[i];
            }
        } else {
            for (int i = 1; i < array.length; i += 2) {
                sum += array[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}

