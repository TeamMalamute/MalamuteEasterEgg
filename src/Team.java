/**
 * Created by lizmiller on 4/28/16.
 /** Purpose:	We created this class to return a string value of each member of our team
 * 			  	to say he/she name and adds for a line of the member likes. So, this class
 * 				has A five string methods that each one represents our team member.
 * Date:		4/28/16
 * 				4/29/16
 *
 * @author:     liz. miller
 * @author:		Abdulkadir S Fiqi
 * @version		2016.29.4.001
 */
public class Team {

    /**
     *  <p>Total_MEMBER holds constants size of the array.</p>
     */
    private static final int TOTAL_MEMBERS = 5;


    /**
     * <p>This String value return by method represents the Liz Miller.</p>
     * @return string value.
     */
    private static String liz() {
        return "My name is Liz, and I love to code!!";
    }

    /**
     * <p>This String value return by method represents the Abdul.</p>
     * @return string value.
     */
    private static String abdul() {
        return "I'm Abdul, too lazy to code but too smart to find shortcut!!!";
    }

    /**
     * <p>This String value return by method represents the Tabi.</p>
     * @return string value.
     */
    private static String tabi() {
        return "I'm Tabi! I don't really wanna think too hard about something cool to say about myself so I'll stop now.";
    }

    /**
     * <p>This String value return by method represents the Lan.</p>
     * @return string value.
     */
    private static String lan() {
        return "I'm Lan, do I like to code? not until the code is working!";
    }

    /**
     * <p>This String value return by method represents the Casey.</p>
     * @return string value.
     */
    private static String casey() {
        return "";
    }

    /**<p>This integer methods returns the total number of our team.</p>
     *
     * @return the total members.
     */
    public static int getTotalMembers(){
        return getNames().length;
    }

    /**<p>This method creates a string array that calls each above methods and returns
     * it value as a string.</p>
     *
     * @return the string value each called method.
     */
    public static String[] getNames() {
        String[] names = new String[TOTAL_MEMBERS];
        names[0] = lan();
        names[1] = liz();
        names[2] = abdul();
        names[3] = casey();
        names[4] = tabi();
        return names;
    }

}

