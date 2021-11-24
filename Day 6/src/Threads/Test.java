package Threads;

/**
 * 
 * @author Keith Tanner
 * Title: Test.java
 * Description: Tests the created threads.
 * 
 */
public class Test {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Thread1());
		thread1.start();
	}
}