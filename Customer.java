public class Customer {

    private int customerId;
    private String customerName;
    private double waterUnits;

    public Customer(int customerId, String customerName, double waterUnits) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.waterUnits = waterUnits;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getWaterUnits() {
        return waterUnits;
    }
}