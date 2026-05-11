public class WaterBill {

    private Customer customer;
    private double billAmount;
    private double tax;
    private double totalBill;

    public WaterBill(Customer customer) {
        this.customer = customer;
        calculateBill();
    }

    public void calculateBill() {

        double units = customer.getWaterUnits();

        if (units <= 100) {
            billAmount = units * 5;
        }
        else if (units <= 300) {
            billAmount = units * 8;
        }
        else {
            billAmount = units * 10;
        }

        tax = billAmount * 0.10;
        totalBill = billAmount + tax;
    }

    public void displayBill() {

        System.out.println("\n========== WATER BILL ==========");
        System.out.println("Customer ID   : " + customer.getCustomerId());
        System.out.println("Customer Name : " + customer.getCustomerName());
        System.out.println("Water Units   : " + customer.getWaterUnits());
        System.out.println("Bill Amount   : ₹" + billAmount);
        System.out.println("Tax (10%)     : ₹" + tax);
        System.out.println("Total Bill    : ₹" + totalBill);
        System.out.println("================================\n");
    }
}