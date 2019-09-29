
public class Car extends Vehicle implements AirConditioning{

	public Car(String make, String model) {
		super(make, model);
	}

	@Override
	public void accelerate(boolean increment) {
		if (increment) {
			this.velocity += 20;
		} else {
			this.velocity -= 20;
		}
	}

	@Override
	public void startAirConditioning() {
		System.out.println("Starting AC");
		
	}
	@Override
	public void stopAirConditioning() {
		System.out.println("AC is stopped");
	}

	@Override
	public String toString() {
		return "Car [Velocity=" + velocity + ", getModel()=" + getModel() + ", getMake()=" + getMake()
				+ ", getTyreSize()=" + getTyreSize() + "]";
	}

}
