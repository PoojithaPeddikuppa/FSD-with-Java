public class SalesCommission {
    public static void main(String[] args) {
        double salesAmount = 13000; 
        double commission;
        /*public void calculate commission(salesAmount);
        if (salesAmount <= 10000) {
            commission = 500;
        }
        else if (salesAmount <= 12000) {
            commission = 500 + (salesAmount - 10000) * 0.10;
        }
        else if (salesAmount <= 15000) {
            commission = 500 + 2000 * 0.10 + (salesAmount - 12000) * 0.15;
        }
        else {
            commission = 500 + 2000 * 0.10 + 3000 * 0.15 + (salesAmount - 15000) * 0.20;
        }
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + commission);*/
    }

    public class Salesman {
        private double salesAmount;

        public Salesman(double salesAmount) {
            this.salesAmount = salesAmount;
        }

        public double calculateCommission() {
            double commission;
            if (salesAmount <= 10000) {
                commission = 500;
            } else if (salesAmount <= 12000) {
                commission = 500 + (salesAmount - 10000) * 0.10;
            } else if (salesAmount <= 15000) {
                commission = 500 + 2000 * 0.10 + (salesAmount - 12000) * 0.15;
            } else {
                commission = 500 + 2000 * 0.10 + 3000 * 0.15 + (salesAmount - 15000) * 0.20;
            }
            return commission;
        }

        public void main(String[] args) {
            Salesman salesman = new Salesman(13000);
            double commission = salesman.calculateCommission();
            System.out.println("Sales Amount: " + salesman.salesAmount);
            System.out.println("Commission: " + commission);
        }
    }
}