import java.util.Scanner;

class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount (in Rs.): ");
        double salesAmount = scanner.nextDouble();
        scanner.close();

        double commission = calculateCommission(salesAmount);
        System.out.println("Commission: Rs. " + commission);
    }

    public static double calculateCommission(double amount) {
        if (amount <= 10000) {
            return 500;
        } else if (amount <= 12000) {
            return 500 + 0.10 * (amount - 10000);
        } else if (amount <= 15000) {
            return 500 + 0.10 * 2000 + 0.15 * (amount - 12000);
        } else {
            return 500 + 0.10 * 2000 + 0.15 * 3000 + 0.20 * (amount - 15000);
        }
    }
}

