package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************ SLEEPY HEAD **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
		String whatday = JOptionPane.showInputDialog("What is today?");
		// Set the boolean isWeekend based on the value they enter
		if (whatday.equalsIgnoreCase("Saturday") && (whatday.equalsIgnoreCase("Sunday"))) {
			JOptionPane.showMessageDialog(null, "Okay u get 2 sleep in :)");
		} else {
			JOptionPane.showMessageDialog(null, "GET YOUR BUTT INTO SCHOOL NOW");
		}
		// If it is the weekend, tell the user they get to sleep in.

		// If it is not the weekend, tell them to get out of bed and go to school!

		/************************ STAR STUDENT **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam

		String score = JOptionPane.showInputDialog("What did you get on your test score?");

		double Score = Double.parseDouble(score);
		if (Score >= 90) {
			JOptionPane.showMessageDialog(null, "good job =)");
		} else if (Score >= 70) {
			JOptionPane.showMessageDialog(null, "eh it's average :\\ but u passed");
		} else {
			JOptionPane.showMessageDialog(null, "Bruh i know you could do better -_-");
		}
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.

		// If the user passed the exam, congratulate them

		// otherwise, wish them better luck next time.

		/************************ GAME OVER **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over.
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;

			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over"
		JOptionPane.showMessageDialog(null, "game over dude");

		/*********************** RED SQUARE ********************/

		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed
		// variable
		isRed = JOptionPane.showInputDialog(null, "What color do you want?").equals("Red");

		boolean isSquare;
		// Now ask the user what shape to draw. Based on their answer, set the isSquare
		// variable
		isSquare = JOptionPane.showInputDialog(null, "What shape do you want?(chose square)").equals("Square");

		// Now you MUST use the && operator to join the booleans for this code.
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use
		// the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if (isSquare && isRed == true) {
			drawRedSquare();
		}
	}

	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	rob.setPenColor(100, 0, 0);
	rob.penDown();
	rob.move(50);
	rob.turn(90);
	rob.move(50);
	rob.turn(90);
	rob.move(50);
	
	}
}
