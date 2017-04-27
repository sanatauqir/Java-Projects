package discussion8;
public class Sedan extends Car{
    
    public Sedan(String make, String model){
        this(make,model,100); // default speed is 100
    }

    public Sedan(String make, String model, double maxSpeed){
        super(make, model, maxSpeed);
    }

}
