package assignment2;

/**
 * 
 * @author Keith Tanner
 * Title: FlowControlsPatterns_PatternD.java
 * Description: Use nested loops that display the following pattern:
 * 1 2 3 4 5 6
 *   1 2 3 4 5
 *     1 2 3 4
 *       1 2 3
 *         1 2
 *           1
 * 
 */
public class FlowControlsPatterns_PatternD {
	public static void main(String[] args) {
		int count = 1;
		for (int i = 6; i > 0; i--) {
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