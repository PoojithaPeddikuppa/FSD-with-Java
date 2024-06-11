public class EmployeeDetails {
    public static void main(String[] args) {
        int[] array = {  };
        int size = array.length;
        int middle = size / 2;
        int sum = array[0] + array[size - 1] + array[middle];
        if (middle - 1 >= 0) sum += array[middle - 1];
        if (middle + 1 < size) sum += array[middle + 1];
        if (middle + 2 < size) sum += array[middle + 2];
        System.out.println("Sum: " + sum);
    }
}

