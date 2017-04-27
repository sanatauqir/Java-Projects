package discussion8;
public class Automobile {

	private String make;
	private String model;
	private double maxSpeed;
	private Engine myEngine;
	private int numberOfWheels;
	private double speed;
	
	public void drive(double speed){
		myEngine.rev();
		if (speed > maxSpeed)
			speed = maxSpeed;
		this.speed = speed;
		System.out.println("Driving at " + speed + "mph.");
	}
	
	public void stop(){
				this.speed = 0;
				System.out.println("Stopped.");
			}
	
	public double getSpeed(){
		return this.speed;
	}
	
	public Automobile(String make, String model, double maxSpeed, int numberOfWheels){
		this.make = make;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.myEngine = new Engine();
		this.numberOfWheels = numberOfWheels;
	}
}
