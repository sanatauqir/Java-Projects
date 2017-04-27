package discussion8;
public class Convertible extends Car {
    public boolean roofDown = true;

    public boolean toggleRoof(){
        double tooFastForToggle = 10;
        if (this.getSpeed()<tooFastForToggle){
            roofDown = !roofDown;
            if (roofDown)
                System.out.println("Roof going down.");
            else
                System.out.println("Roof going up.");
        }
        else
            System.out.println("Too fast to toggle roof.");
        return roofDown;		
    }

    @Override
    public void stop(){
        System.out.println("Convertible comes to a screeching halt.");
        super.stop();
    }

    public Convertible (String make, String model, double maxSpeed){
        super(make, model, maxSpeed);
    }
}
