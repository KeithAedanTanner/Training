package exceptionHierarchy;

/**
 * 
 * @author Keith Tanner
 * Title: Test.java
 * Description: Tests the exception hierarchy
 * 
 */
public class Test {

	public static void main(String[] args) {
		// Test the exception hierarchy
		A a = new C();
		try {
			a.throwMethod();
		} catch (LevelThreeException e3) {
			System.out.println("Caught e3");
		} catch (LevelTwoException e2) {
			System.out.println("Caught e2");
		} catch (LevelOneException e1) {
			System.out.println("Caught e1");
		}
	}
}