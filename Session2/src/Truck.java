/**
 * 
 */

/**
 * @author muhammadali
 *
 */
public class Truck extends Vehicle {

	/**
	 * 
	 */

	public Truck(String make, String model, String tyreSize) {
		super(make, model, tyreSize);
	}

	@Override
	public void accelerate(boolean increment) {
		if (increment) {
			this.velocity += 5;
		} else {
			this.velocity -= 5;
		}

	}

	@Override
	public String toString() {
		return "Truck [getVelocity()=" + getVelocity() + ", getModel()=" + getModel() + ", getMake()=" + getMake()
				+ ", getTyreSize()=" + getTyreSize() + "]";
	}

}
