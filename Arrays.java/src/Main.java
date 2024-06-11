public class Main {
    public static void main(String[] args) {
        int[] array = { /* Your array elements */ };
        int sum = 0, count = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }
}

