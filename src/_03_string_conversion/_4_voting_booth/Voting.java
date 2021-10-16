package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Age = JOptionPane.showInputDialog(null, "How old are you?");
		int AgeI = Integer.parseInt(Age);
		String i = JOptionPane.showInputDialog(null, "Who should the next president be?");
		if (AgeI >= 18) {
			JOptionPane.showMessageDialog(null, "Good Choice.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
		
		
	}

}
