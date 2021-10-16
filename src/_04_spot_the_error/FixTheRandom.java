package _04_spot_the_error;

import java.util.Random;

public class FixTheRandom {

	// This program is supposed to get a random number between 5 and 10 and print a different message for each number.
	// BUT it's not working. If you don't believe me, try running it.
	// Change ONE line of code to fix this program.
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numnber = random.nextInt(6);
		
		if (numnber == 0) {
			System.out.println("FIVE");
		} 
		else if (numnber == 1) {
			System.out.println("SIX");
		} 
		else if (numnber == 2) {
			System.out.println("SEVEN");
		} 
		else if (numnber == 3) {
			System.out.println("EIGHT");
		} 
		else if (numnber == 4) {
			System.out.println("NINE");
		} 
		else if (numnber == 5) {
			System.out.println("TEN");
		}
	}
	
	
}
