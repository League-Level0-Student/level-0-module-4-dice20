package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What did you get on your test score?");
	//int parsedInt = Integer.parseInt(score);
			double Score = Double.parseDouble(score);
				if (Score >=90) {
					JOptionPane.showMessageDialog(null, "good job =)");
				}
				else if (Score >=80) {
					JOptionPane.showMessageDialog(null, "eh it's average :\\");
				}
}
}
