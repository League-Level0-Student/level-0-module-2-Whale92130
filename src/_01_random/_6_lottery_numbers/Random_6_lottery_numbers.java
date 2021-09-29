 package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Random_6_lottery_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 =0;
		int number2 =0;
		int number3 =0;
		int number4 =0;
		int number5 =0;
		int number6 =0;
		Random ran = new Random();
		number1 = ran.nextInt(100);
		number2 = ran.nextInt(100);
		number3 = ran.nextInt(100);
		number4 = ran.nextInt(100);
		number5 = ran.nextInt(100);
		number6 = ran.nextInt(100);
		JOptionPane.showMessageDialog(null," "+number1+" "+number2+" "+number3+" "+number4+" "+number5+" "+number6);
	}

}
