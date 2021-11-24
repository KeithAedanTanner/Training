package assignment2;

/**
 * 
 * @author Keith Tanner
 * Title: FlowControlsPatterns_PatternC.java
 * Description: Use nested loops that display the following pattern:
 *           1
 *         1 2
 *       1 2 3
 *     1 2 3 4
 *   1 2 3 4 5
 * 1 2 3 4 5 6
 * 
 */
public class FlowControlsPatterns_PatternC {
	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 6; i++) {
			count = 1;
			for (int j = 1; j <= 6; j++) {
				if ((7 - j) > i)
					System.out.print("  ");
				else {
					System.out.print(count++);
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}