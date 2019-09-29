import java.util.Scanner;

public class LoopingExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int loopCount = scanner.nextInt();

		int minLoopCount = 2;

		for (int i = 0; i < loopCount && loopCount >= minLoopCount; i = i + 1) {
			System.out.println("Iteration :: " + i);

			if (i > 5) {
				System.out.println("i exceeded the limit");
				break;
			}
		}

//		boolean shouldNotExit = true;
		while (loopCount > 5) {
			System.out.println("While Loop in action");
			loopCount = loopCount - 1;

			if (loopCount > 7) {
				break;
//				shouldNotExit = false;
			}
		}


	}
}
