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
		
		if(one < two && one < three){
			least = one;
		}
		if(one > two && one > three){
			greatest = one;
		}
		if(one > two && one < three || one > three && one < two){
			middlest = one;
		}
	
		if(two < one && two < three){
			least = two;
		}
		if(two > one && two > three){
			greatest = two;
		}
		if(two > one && two < three || two > three && two < one){
			middlest = two;
		}
		
		if(three < two && three < one){
			least = three;
		}
		if(three > two && three > one){
			greatest = three;
		}
		if(three > two && three < one || three < two && three > one){
			middlest = three;
		}
		
		System.out.println(greatest + " " + middlest + " " +  least);
		System.out.println(least + " " + middlest + " " +  greatest);
	}
}
