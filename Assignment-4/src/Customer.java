public class Customer {
    private int id;
    private String name;
    private double orderAmount;

    public Customer(int id, String name, double orderAmount) {
        this.id = id;
        this.name = name;
        this.orderAmount = orderAmount;
    }

    public void displayDetails() {
        System.out.println("Customer Id: " + id);
        System.out.println("Customer name: " + name);
        System.out.println("Order amount: " + orderAmount);
    }

    public static void main(String[] args) {
        Customer customer = new Customer(1, "poojitha", 300.0);
        customer.displayDetails();
    }
}
