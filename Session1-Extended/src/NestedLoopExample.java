/**
 * 
 */

/**
 * @author muhammadali
 *
 */
public class NestedLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 3; i = i + 1) {

			for (int j = 0; j < 3; j = j + 1) {
				System.out.print("(" + i + "," + j + ")" + "\t");
			}
			System.out.println();
		}
	}

}
