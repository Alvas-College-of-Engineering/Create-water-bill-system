import java.util.ArrayList;
import java.util.Scanner;

public class WaterBillSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customerList = new ArrayList<>();

        int choice;

        do {

            System.out.println("===== WATER BILL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Display All Bills");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Customer ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Water Units Consumed: ");
                    double units = sc.nextDouble();

                    Customer customer = new Customer(id, name, units);
                    customerList.add(customer);

                    System.out.println("Customer Added Successfully!\n");
                    break;

                case 2:

                    if (customerList.isEmpty()) {
                        System.out.println("No customers found!\n");
                    }
                    else {

                        for (Customer c : customerList) {

                            WaterBill bill = new WaterBill(c);
                            bill.displayBill();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}