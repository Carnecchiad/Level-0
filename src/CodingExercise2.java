import javax.swing.JOptionPane;

public class CodingExercise2 {
	public static void main(String[] args) {

		String j = JOptionPane.showInputDialog("How old are you?");
		int i = Integer.parseInt(j);
		JOptionPane.showMessageDialog(null, "you were born in the year " + (2016 - i));
		if (i > 30) {
			JOptionPane.showMessageDialog(null, "you're too old for this");
		}

	}
}
