
public class Sample {
	public static void main(String[] args) {
		int a = 100;
		int b = 120;

		System.out.println(a);
		System.out.println(b);
		int sum = a + b;
		int difference = a - b;
		int product = a * b;
		double division = a / b;
		double x = a;
		// +,-*,/,==,=,<=,>=,<,>

		System.out.println("Sum " + sum);
		System.out.println("Difference " + difference);
		System.out.println("Product " + product);
		System.out.println("Division " + division);
		System.out.println("X " + x);

		if (sum < difference) {
			System.out.println("Sum is less then difference");
		} else if (a == 100 || b == 120) {
			System.out.println("A is 100 or B is 120");
		} else {

		}

		switch (a) {
		case 125:
			System.out.println("Case for a is 125");
			break;
		case 100:
			System.out.println("Case for a is 100");
			break;
		case 120:
			System.out.println("Case for a is 120");
			break;

		default:
			System.out.println("Case is default");
			break;
		}
	}
}
