
public class ArraySample {

	public ArraySample() {
	}

	public static void main(String[] args) {
		int values[] = { 1, 101, 3, 4, 5 };

		for (int value : values) {
			System.out.println("Value :: " + value);
		}

		float x = 10.2f;
		int y = (int) x;
		System.out.println("Casted value of y :: " + y);

//		System.out.println(values[4]);
//
//		for (int index = 0; index < values.length; index++) {
//			System.out.println(values[index]);
//		}

	}

}
