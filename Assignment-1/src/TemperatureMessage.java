import java.util.Scanner;

public class TemperatureMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = scanner.nextInt();
        scanner.close();
        switch (temp) {
            case 0:
                System.out.println("ICE");
                break;
            case 100:
                System.out.println("STEAM");
                break;
            default:
                if (temp > 0 && temp < 100) {
                    System.out.println("WATER");
                } else {
                    System.out.println("Invalid temperature value.");
                }
        }
    }
}
