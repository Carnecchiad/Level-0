import java.util.Calendar;

import javax.swing.JOptionPane;

public class CodingExercise2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		String j = JOptionPane.showInputDialog("How old are you?");
		int i = Integer.parseInt(j);
		now.add(Calendar.YEAR, -i);
		int year = now.get(Calendar.YEAR);
		JOptionPane.showMessageDialog(null, "you were born in the year " + (year));
		if (i > 30) {
			JOptionPane.showMessageDialog(null, "you're too old for this");
		}

	}
}
