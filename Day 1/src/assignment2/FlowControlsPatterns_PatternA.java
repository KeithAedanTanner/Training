package assignment2;

/**
 * 
 * @author Keith Tanner
 * Title: FlowControlsPatterns_PatternA.java
 * Description: Use nested loops that display the following pattern:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 
 */
public class FlowControlsPatterns_PatternA {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}