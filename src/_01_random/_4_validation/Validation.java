//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		//System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
			System.out.println("You are looking nice today.");
		}
		else if(randomNumber == 2) {
			System.out.println(" Your positivity is infectious.");
		}
		else if(randomNumber == 3) {
			System.out.println("You should be so proud of yourself.");
		}
		else if(randomNumber == 4) {
			System.out.println(" You’re a true gift to the people in your life.");
		}
		else if(randomNumber == 5) {
			System.out.println("Thanks for being you!");
		}
		else {
			System.out.println("You are one of a kind.");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}