import java.util.Scanner;

public class CityNameLength {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

               String[] cities = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            cities[i] = scnr.nextLine();
        }

        String longestCity = cities[0];
        for (int i = 1; i < 5; i++) {
            if (cities[i].length() > longestCity.length()) {
                longestCity = cities[i];
            }
        }

        System.out.println("The city with the highest number of characters is: " + longestCity);
    }
}
