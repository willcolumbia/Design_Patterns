package Factory;
/**
 * The type sedan car 
 * @author Will Columbia
 */
public class SedanCar extends Car{
/**
 * calls the super from car and holds the make and model
 * @param make
 * @param model
 */
    public SedanCar(String make,String model){
    super(make, model);
}
    @Override
    /**
     * adds the frame for a sedan car
     */
    protected void addFrame() {
       System.out.println("Adding a three part frame");
        
    }
    @Override
    /**adds the accessories of the sedan car
     * 
     */
    protected void addAccessories() {
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
    
}