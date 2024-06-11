import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        String state;
        if (temperature == 0) {
            state = "ICE";
        } else if (temperature > 0 && temperature < 100) {
            state = "WATER";
        } else if (temperature == 100) {
            state = "STEAM";
        } else {
            state = "Invalid temperature";
        }

        System.out.println("The state of water at " + temperature + "°C is " + state);
    }
}
