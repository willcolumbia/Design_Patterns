package Factory;
/**
 * a Car FFcotry that creates a new small, sedan, and luxury car
 * @author Will Columbia
 */
public class CarFactory {
    /**
     * creates a new car and sets the car type based on the car type that is passed
     * @param type
     * @param make
     * @param model
     * @return car
     */
    public static Car createCar(String type,String make,String model) {
        Car car = new SmallCar(make, model);
        if(type.equals(CarType.SMALL.toString().toLowerCase())) {
           car = new SmallCar(make,model);
        }
        if(type.equals(CarType.SEDAN.toString().toLowerCase())){
           car = new SedanCar(make, model);
          
        }
        if(type.equals(CarType.LUXURY.toString().toLowerCase())){
            car = new LuxuryCar(make, model);
        }
         car.assemble();
        return car;
    }
}