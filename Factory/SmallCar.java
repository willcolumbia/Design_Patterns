package Factory;
/**
 * a Small type car 
 * @author Will Columbia
 */
public class SmallCar extends Car {
    /**
     * Calls super from car and holds teh make and model
     * @param make
     * @param model
     */
    public SmallCar(String make,String model) {
        super(make, model);

    }
    @Override
    /**
     * adds the small frame
     */
    protected void addFrame(){
        System.out.println("Adding small frame");
    }
    @Override
    /**
     * adds the accessories for the small car
     */
    protected void addAccessories(){
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.FLOOR_MATTS);
        
    }
}
