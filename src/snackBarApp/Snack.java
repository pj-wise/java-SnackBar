package snackBarApp;

public class Snack {

    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachId;

    public Snack(String name, int quantity, double cost, int vendingMachId
    ) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachId = vendingMachId;
    }

    //getters & setters 
    public void setId(int id) {
        this.id = id
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setVendingMachId(int vendingMachId) {
        this.vendingMachId = vendingMachId;
    }

    public int getVendingMachId(){
        return vendingMachId;
    }

    //regular methods 
    public void addQuantity(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void buySnack(int quantity) {
        this.quantity = this.quantity - quantity;
    }

    public double getTotalCost(int quantity) {
        return cost * quantity;
    }
}