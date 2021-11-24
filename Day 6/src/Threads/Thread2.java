package Threads;

/**
 * 
 * @author Keith Tanner
 * Title: Thread2.java
 * Description: Creates a thread that calculates the square of a number.
 * 
 */
public class Thread2 implements Runnable {
	int number;

	Thread2(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Thread 2: The number " + number + " is even. The square is " + (number * number));
	}
}