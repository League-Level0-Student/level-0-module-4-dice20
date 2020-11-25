package _01_double._1_change_calculator;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int parseNickles = Integer.parseInt(nickels);
		// Ask he user how many nickels they have
		String quarter = JOptionPane.showInputDialog("How many quarters do you have?");
		int parseQuarter= Integer.parseInt(quarter);
		
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int parseDimes = Integer.parseInt(dimes);
		// Convert their answer to an int. Hint:

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has. Hint: Use a double variable

		// Tell the user how much money they have in dollars and cents format (e.g.
		// $6.75)

	}
}
