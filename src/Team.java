/**
 * Created by lizmiller on 4/28/16.
 */
public class Team {

    private static final int TOTAL_MEMBERS = 5;



    private static String liz() {
        return "My name is Liz, and I love to code!!";
    }

    private static String abdul() {
        return "";
    }

    private static String tabi() {
        return "I'm Tabi! I don't really wanna think too hard about something cool to say about myself so I'll stop now.";
    }

    private static String lan() {
        return "";
    }

    private static String casey() {
        return "";
    }


    public static int getTotalMembers(){
        return getNames().length;
    }
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
