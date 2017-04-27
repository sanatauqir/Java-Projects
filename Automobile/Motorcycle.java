package discussion8;
public class Motorcycle extends Automobile{

    int displacement;

    public void doWheelie(){
        System.out.println("Weee!");
    }

    public Motorcycle(String make, String model, double maxSpeed, int displacement){
        super(make, model, maxSpeed, 2);
        this.displacement = displacement;
    }
}
