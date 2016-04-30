/**
 * Created by lizmiller on 4/28/16.
 */
/** Purpose:	this class instantiated Team objects and it creates a stringbuilder object
 *  			to append the string value of each return which is made by the methods Team.java.   the this class to return a string value of each member of our team
 * 			  	It is also prints " Welcome to Our Easter Egg" and "Team malamute."
 * Date:		4/28/16
 * 				4/29/16
 *
 * @author:     liz. miller
 * @author 		Abdulkadir S Fiqi
 * @version		2016.29.4.001
 */
public class Welcome {
    /** welocomeString instantiates the an objects of Team instances, and
     *  It creates a stringBuilder to appended and prints the string value of the methods
     *  in Team.java class.
     *
     * @return the value of called methods.
     */
    public static String welcomeString() {
        String[] names = Team.getNames();
        StringBuilder builder = new StringBuilder();
        builder.append("WELCOME TO OUR EASTER EGG\n");
        builder.append("TEAM MALAMUTE\n");

        for(String name : names) {
            builder.append(name + "\n");
        }
        return builder.toString();

    }
}