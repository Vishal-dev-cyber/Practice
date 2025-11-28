import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    class Customers {
        private String name;
        private int units;

        //constructor
        public Customers(String name, int units) {
            this.name = name;
            this.units = units;
        }

        //method for calculate bill
        public double CalculateBill() {
            double bill = 0;
            if (units <= 100) bill = units * 1.5;
            else if (units <= 200) bill = (100 * 1.5) + (units - 100) * 2.5;
            else if (units <= 300) bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 3.5;
            else bill = (100 * 1.5) + (100 * 2.5) + (100 * 3.5) + (units - 300) * 4.0;
            return bill;
        }

        public void displayBill() {
            System.out.println("\n-----Electricity Bill----");
            System.out.println("Name: " + name);
            System.out.println("Units Consumed: " + units);
            System.out.println("Total Bill: " + CalculateBill());
            System.out.println("-------End---------");
        }
    }
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Customers> customers = new ArrayList<>();
        System.out.println("Enter number of customers:");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of the customer" + i + ":");
            System.out.println("Name:");
            String name = scan.nextLine();
            System.out.println("Units consumed:");
            int units = scan.nextInt();
            scan.nextLine();
            customers.add(new Customers(name, units));
        }

        for (Customers c : customers) {
            c.displayBill();
        }

        scan.close();
    }
}
