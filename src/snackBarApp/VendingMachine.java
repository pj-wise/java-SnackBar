package snackBarApp;

public class VendingMachine {

    //fields 
    private static int maxId = 0;
    private int id;

    private String name;

    //constructor
    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    //getters & setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}