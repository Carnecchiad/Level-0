import javax.swing.JOptionPane;

public class Riddle {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "What tastes better than it smells?");
		String i = JOptionPane.showInputDialog("Answer");
		if ("a tongue".equalsIgnoreCase(i)) {
			JOptionPane.showMessageDialog(null, "how did you get that right? Get a life...");
		} else {
			JOptionPane.showMessageDialog(null, "try again");
		}
	}
}
