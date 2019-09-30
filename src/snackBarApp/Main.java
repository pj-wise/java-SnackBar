package snackBarApp;

public class Main {
    public static void main(String[] args) {
        
        //customers
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        //machines
        VendingMachine vend1 = new VendingMachine("Food");
        VendingMachine vend2 = new VendingMachine("Drink");
        VendingMachine vend3 = new VendingMachine("Office");

        //snacks in vend1
        Snack s1 = new Snack("Chips", 36, 1.75, vend1.getid());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vend1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vend1.getId());

        //snacks in vend2
        Snack s4 = new Snack("Soda", 24, 2.50, vend2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vend2.getId());


        //Console Checks
        System.out.println("COMPILED AND WORKING");
    }
}