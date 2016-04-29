/**
 * Created by lizmiller on 4/28/16.
 */
public class Welcome {

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
