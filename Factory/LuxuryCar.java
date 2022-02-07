package Factory;
/**
 * A luxury type car
 * @author Will Columbia
 */
public class LuxuryCar extends Car{
/**
 * calls super from car and holds the  make and model
 * @param make
 * @param model
 */
    public LuxuryCar(String make,String model){
        super(make, model);
    }
/**
 * adds the luxury frame
 */
    @Override
    protected void addFrame() {
        System.out.println("Adding a beautiful fram");
       
        /**
         * adds the luxury engine
         */
    }
    @Override
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }
    /**
     * adds the luxury accessories 
     */
    @Override
    protected void addAccessories(){
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
    }
    
    
}
