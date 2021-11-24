package assignment1;

/**
 * 
 * @author Keith Tanner
 * Title: Population.java
 * Description: Displays the population for each of the next five years.
 * 
 */
public class Population {
	public static int yearlyChange(int rateInSeconds) {
		return (31536000 / rateInSeconds); // Calculated from 60*60*24*365
	}

	public static void main(String[] args) {
		// Rates in 1 per every # seconds (allows for easy modification of rates)
		int birthRate = 7;
		int deathRate = -13;
		int immigrationRate = 45;

		int timespan = 5;
		int population = 312032486;

		// Convert to yearly rates
		birthRate = yearlyChange(birthRate);
		deathRate = yearlyChange(deathRate);
		immigrationRate = yearlyChange(immigrationRate);

		int changePerYear = birthRate + deathRate + immigrationRate;

		System.out.println("Current Population: " + population);
		// Calculate and print the population for each year
		for (int i = 0; i < timespan; i++) {
			population = population + changePerYear;
			System.out.println("Year " + (i + 1) + " Population: " + population);
		}
	}
}