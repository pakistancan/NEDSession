/**
 * 
 */

/**
 * @author muhammadali
 *
 */
public abstract class Vehicle {

	protected int velocity;
	private String model;
	private String make;
	private String tyreSize;

	private static int instanceCount = 0;
	
	public static int getInstanceCount() {
		return instanceCount;
	}
	
	/**
	 * 
	 */
	public Vehicle(String make, String model, String tyreSize) {
		this(make, model);
		this.tyreSize = tyreSize;
		System.out.println("Creating Vehicle");

	}

	public Vehicle(String make, String model) {
		System.out.println("Creating Vehicle");
		this.make = make;
		this.model = model;
		instanceCount++;	
	}

	public int getVelocity() {
		return velocity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getTyreSize() {
		return tyreSize;
	}

	public void setTyreSize(String tyreSize) {
		this.tyreSize = tyreSize;
	}

	public void start() {
		velocity = 10;
	}

	public abstract void accelerate(boolean increment);
	
	public void stop() {
		velocity = 0;
	}

	public void makeNoise() {
		System.out.println("Give Way");
	}

	@Override
	public String toString() {
		return "Vehicle [velocity=" + velocity + ", model=" + model + ", make=" + make + ", tyreSize=" + tyreSize + "]";
	}

}
