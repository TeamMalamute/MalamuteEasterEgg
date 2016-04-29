import java.util.Scanner;

/**
 * Created by lizmiller on 4/28/16.
 */
public class Main {
	
	private static final String EXIT = "x";
	private static final String EASTER_EGG_STRING = "easteregg";
	private static final String LOOP_TEXT = "To exit, input '"+ EXIT + "' (without quotes) and hit enter.";

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
