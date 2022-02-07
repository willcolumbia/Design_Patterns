package Factory;

import java.util.ArrayList;
/**
 * Keeps track of the cars make and model. Assembles the car by adding all of its parts
 * displays the accessories
 * @author Will Columbia
 */
public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories;
/**
 * sets the make and model and creates a new arraylist
 * @param make
 * @param model
 */
    public Car(String make,String model) {
        this.make = make;
        this.model = model;
        accessories = new ArrayList<Accessories>();
    }
    /**
     * assembles the car calling all the nessecary methods
     */
    public void assemble() {
        System.out.println("Creating a "+make+" "+model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }
    protected abstract void addFrame();
/**
 * prints adding wheels message
 */
    protected void addWheels() {
        System.out.println("Adding the wheels");

    }
    /**
     * prints the adding engine message
     */
    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }
    /**
     * prints the adding windows message
     */
    protected void addWindows() {
        System.out.println("Adding Windows");

    }
    protected abstract void addAccessories();
/**
 * prints the accessories that are specific to each car
 */
    protected void displayAccessories() {
        System.out.println("Accessories");
        for(int i = 0;i<accessories.size();i++){
            System.out.println("-"+ accessories.get(i)+"\n");
        }
    }
}
