import javax.swing.JOptionPane;

public class Age_Thingy {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("How old are you?");
        	int age = Integer.parseInt(a);
        	String b = JOptionPane.showInputDialog("Have you had your birthday this year?");
        	if(b.equalsIgnoreCase("no")){
        		age++;
        	}
        	for(int i = 0; i <= age; i++){
        		System.out.println(2016 - i);
        	}
	}
}
