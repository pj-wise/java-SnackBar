package snackBarApp;

public class Snack {

    //fields
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachId;

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
}