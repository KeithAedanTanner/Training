package Threads;

import java.util.Random;

/**
 * 
 * @author Keith Tanner
 * Title: Thread1.java
 * Description: Creates a thread that generates a random number each second for 100 seconds.
 * If even, it creates a Thread2. If odd, it creates a Thread3.
 * 
 */
public class Thread1 implements Runnable {
	Random random;
	Thread square, cube;

	@Override
	public void run() {
		int number;
		random = new Random();
		int count = 0;

		try {
			while (count < 100) {
				number = random.nextInt(100);
				System.out.println("Thread 1: Generated number is " + number);

				if (number % 2 == 0) {
					square = new Thread(new Thread2(number));
					square.start();
				}

				else {
					cube = new Thread(new Thread3(number));
					cube.start();
				}

				Thread.sleep(1000);
				System.out.println("");
				count++;
			}
		} catch (Exception e) {
			System.out.println("Exception: Thread Interrupted");
		}
	}
}