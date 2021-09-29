//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		String Q1 = JOptionPane.showInputDialog("Ask the magic 8 ball a question.");

		// 3. Make a variable and initialize it to a random number.
		Random ran = new Random();
		//     ** You will need to make a random object!
		//     Limit the random numbers to be between 0 and 3
		int number = 0;
		number = ran.nextInt(4);
	// 4. If the random number is 0
		if (number == 0) {
			JOptionPane.showMessageDialog(null, "No");
		}
		else if (number == 1) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		else if (number == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Ask again");
		}
	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
}