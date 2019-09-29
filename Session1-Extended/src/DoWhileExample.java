
public class DoWhileExample {

	public static void main(String[] args) {
		int inputValue = 10;
		int externalValue = 100;
		do {
			inputValue = inputValue - 1;
			System.out.println("Do...While in Action");
			externalValue = externalValue - 30;
			if (externalValue <= 40) {
				break;
			}

		} while (inputValue >= 5);

	}

}
