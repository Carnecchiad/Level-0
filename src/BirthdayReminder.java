
//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "October 28th";
		String dadsBirthday = "January 31st";
		String myBirthday = "November 15th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String a = JOptionPane.showInputDialog("who's birthday would you like to know?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, a + "?");
		// 4. if user asked for "mom"
		if (a.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		if (a.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		if (a.equalsIgnoreCase("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		if (a.equalsIgnoreCase("george r r martin")){
			JOptionPane.showMessageDialog(null,"I dont want to know that person");
		}
		else{
			JOptionPane.showMessageDialog(null, "I don't know that person");
		}
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}