import javax.swing.JOptionPane;

public class tresNumeros {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("give me three numbers!");
		String num2 = JOptionPane.showInputDialog("");
		String num3 = JOptionPane.showInputDialog("");
		int greatest = 0;
		int middlest = 0;
		int least = 0;

		int one = Integer.parseInt(num1);
		int two = Integer.parseInt(num2);
		int three = Integer.parseInt(num3);

		if (one < two) {
			if (one < three) {
				least = one;
			}
		}
		if (one > two) {
			if (one > three) {
				greatest = one;
			}
		}
		if (one > two && one < three) {
			middlest = one;
			if (one > three && one < two) {
				middlest = one;
			}
		}

		if (two < one) {
			if (two < three) {
				least = two;
			}
		}
		if (two > one) {
			if (two > three) {
				greatest = two;
			}
		}
		if (two > one && two < three) {
			middlest = two;
			if (two > three && two < one) {
				middlest = two;
			}

		}

		if (three < two) {
			if (three < one) {
				least = three;
			}
		}
		if (three > two) {
			if (three > one) {
				greatest = three;
			}
		}
		if (three > two && three < one) {
			middlest = three;
			if (three < two && three > one) {
				middlest = three;
			}
		}

		System.out.println(greatest + " " + middlest + " " + least);
		System.out.println(least + " " + middlest + " " + greatest);
	}
}
