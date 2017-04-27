package discussion8;
import java.util.ArrayList;

public class CarTransporter extends Automobile {
        
    private ArrayList<Car> cars = new ArrayList<Car>();

    public CarTransporter(){
        super("Car Transporter Company Inc.", "XP100", 80, 18); // 80 is max speed, 18 is number of wheels
    }

    public void load(Car newCar){
        cars.add(newCar);
    }

    public Car unload(){
        Car oldCar = null;
        if (cars.size() < 1)
                System.out.println("Can't unload! Empty.");
        else{
                oldCar = cars.get(0);
                cars.remove(0);
        }
        return oldCar;
    }

}
