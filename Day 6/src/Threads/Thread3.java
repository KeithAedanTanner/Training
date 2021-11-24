package Threads;

/**
 * 
 * @author Keith Tanner
 * Title: Thread3.java
 * Description: Creates a thread that calculates the cube of a number.
 * 
 */
public class Thread3 implements Runnable {
	int number;

	Thread3(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Thread 3: The number " + number + " is odd. The cube is " + (number * number * number));
	}
}