package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

import _01_random._3_dice_roll.DiceRoll;

public class StringsCannotAdd {
	public static void main(String[] args) {

		// 1) Make a main method that includes all the steps below…. 
		
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
		String num4 = JOptionPane.showInputDialog(null, "enter the number 4, or else...");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
		String num6 = JOptionPane.showInputDialog(null, "enter the number 6, or else...");	
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
		System.out.println(num4 + num6);
			// Did you notice 46 instead of 4 + 6 = 10?
			//yes I did
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
		String fiveAsString = JOptionPane.showInputDialog(null, "enter the number 5, or else...");	
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
		System.out.println(num4 + num6 + fiveAsString);	
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			//yes I did
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			num4 = Integer.parseInt(num4);
			// 7) Do the same for sixAsString. 
			
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
	}
	}

