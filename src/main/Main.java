package main;
/* Team Malamute
 * TCSS - 360
 * Group Project
 */
import java.util.Scanner;

/** Purpose:	This class is the main or the driver class of Easter Egg and it calls Welcome class
 * 				for print string value that represents each malamute team member. it also runs the program
 * 				by prompting "We are Team Malamute" message and waiting someone to typing "Easteregg"
 * 				or 'x' for exit as well as invalid input if one types wrong value. finally it prints at end
 * 				of program stop "bye!"
 *
 * Date:		4/28/16
 * 				4/29/16
 *
 * @author:     liz. miller
 * @author 		Abdulkadir S Fiqi
 * @author:		Tabi Stein
 * @version		2016.29.4.001
 */
public class Main {
	/**
	 * This constant fields holds the string value of 'x'
	 */
	private static final String EXIT = "x";
	/**
	 * This constant fields holds the string value of "easteregg"
	 */
	private static final String EASTER_EGG_STRING = "easteregg";
	/**
	 * This constant fields holds a line of string text.
	 */
	private static final String LOOP_TEXT = "To exit, input '"+ EXIT + "' (without quotes) and hit enter.";
	/**
	 * This is the main method which runs the program and prompt messages to the console
	 * it also uses a scanner objects to scan the any typed value in the program.
	 * @param args is the default argument of the main method.
	 */
	public static void main(String[]args) {
		System.out.println("We are Team Malamute and this is our Easter Egg");
		Scanner consoleInput = new Scanner(System.in);
		boolean keepRunning = true;
		while (keepRunning) { //run as long as the user wants to run the application
			System.out.println(LOOP_TEXT);
			while (consoleInput.hasNextLine()) { //wait for user input

				String userInput = consoleInput.nextLine();
				if (userInput.equals(EXIT)) {
					keepRunning = false;
				} else if (userInput.equals(EASTER_EGG_STRING)) {
					System.out.println(Welcome.welcomeString());
				} else {
					System.out.println("Invalid input.");
				}
				break;
			}
		}
		System.out.println("Bye!");
		consoleInput.close();
	}
}
