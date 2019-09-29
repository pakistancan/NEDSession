/**
 * 
 */

/**
 * @author muhammadali
 *
 */
public class MyFirstClass {

	/**
	 * 
	 */
	public MyFirstClass() {
	}

	public static void main(String[] args) {

		Vehicle firstVehicle = new Truck("Hino", "V28", "215/75/85");

		Vehicle secondVehicle = new Car("Toyota", "Corolla");

		Vehicle vehicles[] = { firstVehicle, secondVehicle };

		for (Vehicle vehicle : vehicles) {
			vehicle.start();
			vehicle.accelerate(true);
			System.out.println("Vehicle After Acceleration " + vehicle);
			vehicle.accelerate(false);
			vehicle.accelerate(false);
			vehicle.accelerate(false);

			if (vehicle instanceof AirConditioning) {
				AirConditioning ac = (AirConditioning) vehicle;
				ac.startAirConditioning();				
			}

			System.out.println("Vehicle After Deceleration " + vehicle);
		}

		System.out.println("Vehicle Created :: " + Vehicle.getInstanceCount());

	}

}
