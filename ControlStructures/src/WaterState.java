/*import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temperature = scnr.nextInt();
        String state;
        if (temperature == 0) {
            state = "ICE";
        }
        else if (temperature > 0 && temperature < 100) {
            state = "WATER";
        }
        else if (temperature == 100) {
            state = "STEAM";
        }
        else {
            state = "Invalid temperature";
        }

        System.out.println("The state of water at " + temperature + "°C is " + state);
    }
}*/

import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the temperature (in Celsius): ");
        int temperature = scnr.nextInt();
        String state;

        switch (temperature) {
            case 0:
                state = "ICE";
                break;
            case 100:
                state = "STEAM";
                break;
           default: 
                if (temperature > 0 && temperature < 100) {
                    state = "WATER";
                } else {
                    state = "Invalid input";
                }
        }

        System.out.println("The state of water at " + temperature + "°C is " + state);
    }
}
