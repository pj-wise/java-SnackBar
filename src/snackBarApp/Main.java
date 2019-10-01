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
        Snack s1 = new Snack("Chips", 36, 1.75, vend1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vend1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vend1.getId());

        //snacks in vend2
        Snack s4 = new Snack("Soda", 24, 2.50, vend2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vend2.getId());


        //Console Checks
        System.out.println("COMPILED AND WORKING");

        cust1.buy(s4.getTotalCost(3));
        s3.buySnack(1);
        System.out.println("-------- scenario 1 ---------");
        
        System.out.println("Customer 1 cash " + cust1.getCash());
        System.out.println("Snack 3 quantity " + s3.getQuantity());
        
     
        
        cust2.buy(s4.getTotalCost(2));
        s4.buySnack(2);

        System.out.println();

        System.out.println("-------- scenario 2 ---------");

        System.out.println("Customer 2 cash " + cust2.getCash());
        System.out.println("Snack 4 quantity " + s4.getQuantity());
        System.out.println();

        cust1.addCash(10.00);
        System.out.println("-------- scenario 3 ---------");

        System.out.println("Customer 1 " + cust1.getCash());
        System.out.println();

        System.out.println("-------- scenario 4 ---------");
        cust1.buy(s2.getTotalCost(1));
        s2.buySnack(1);
        System.out.println("Customer 1 cash on hand " + cust1.getCash());
        System.out.println("Quantity of snack 2 is " + s2.getQuantity());
        System.out.println();

        System.out.println("-------- scenario 5 ---------");
        cust1.buy(s2.getTotalCost(1));
        s2.buySnack(1);
        System.out.println("Customer 1 cash on hand " + cust1.getCash());
        System.out.println("Quantity of snack 2 is " + s2.getQuantity());
        System.out.println();

        System.out.println("-------- scenario 6 ---------");
        s3.addQuantity(12);
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());
        System.out.println();

        System.out.println("-------- scenario 7 ---------");
  cust2.buy(s3.getTotalCost(3));
        s3.buySnack(3);
        System.out.println("customer 2 cash on hand " + cust2.getCash());
        System.out.println("Quantity of snack 3 is " + s3.getQuantity());
        System.out.println();

    }
}