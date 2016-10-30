import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExercise1 {

	public static void main(String[] args) {
		Robot r = new Robot();
		String j = JOptionPane.showInputDialog("What color do you want?");
		r.show();
		r.penDown();
		r.setPenWidth(10);
		if (j.equals("BLUE")) {
			r.setPenColor(0, 0, 255);
		} else if (j.equals("YELLOW")) {
			r.setPenColor(255, 0, 0);
		}

		int f = 5;
		for (int i = 0; i < f; i++) {
			r.move(100);
			r.turn(360 / f);
		}
	}
}
