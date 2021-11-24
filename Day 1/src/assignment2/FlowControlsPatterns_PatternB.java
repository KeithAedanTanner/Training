package assignment2;

/**
 * 
 * @author Keith Tanner
 * Title: FlowControlsPatterns_PatternB.java
 * Description: Use nested loops that display the following pattern:
 * 1 2 3 4 5 6
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * 
 */
public class FlowControlsPatterns_PatternB {
	public static void main(String[] args) {
		for (int i = 6; i > 0; i--) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}