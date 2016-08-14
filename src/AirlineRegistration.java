// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
	int planesize = 10;
		for(int i = 0; i < planesize; i++){
	 String a = JOptionPane.showInputDialog("First Name");	
	 String b = JOptionPane.showInputDialog("Last Name");	
	 String c = JOptionPane.showInputDialog("Destination airport");	
	 String d = JOptionPane.showInputDialog("Birthday M/D/Y");	
	 String e = JOptionPane.showInputDialog("Male/Female");	
	 System.out.println(b + " " + a + " " + "< " + d + " " + e + " >");
	 System.out.println("Traveling to: " + c);
	 System.out.println(" ");
	 System.out.println("" + (i+1)  + " passenger(s) exist(s) upon the plane");
	 System.out.println(" ");
		}

	}
	
}



/**Extra Difficult Challenge: have the program repeat until plane is full and print out the number of passengers after each boarding pass.
*/