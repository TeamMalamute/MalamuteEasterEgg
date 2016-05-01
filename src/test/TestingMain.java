
/**
 * Created by lizmiller on 4/28/16.
 */
package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Team;
public class TestingMain {
	
//	   @Test
//       public void testMain() {
//           String [] array = new String[3];
//           Main.main(array);
//       }
//       
	private static final int MEM_COUNT = 5;
	/**
	 * Test method for getTotalMembers().
	 */
	@Test
	public void getTotalMembersTest() {
		assertEquals("getTotalMembers method failed!", MEM_COUNT, Team.getTotalMembers());
	}

	/**
	 * Test method for getNames()().
	 */
	@Test
	public void getNamesTest() {
		String[] names = Team.getNames();
		// Lan
		assertEquals("getNamesTest method failed!", "I'm Lan, do I like to code? not until the code is working!",
				names[0]);
		// Liz
		assertEquals("getNamesTest method failed!", "My name is Liz, and I love to code!!", names[1]);
		// Abdul
		assertEquals("getNamesTest method failed!", "I'm Abdul, too lazy to code but too smart to find shortcut!!!",
				names[2]);
		// Casey
		assertEquals("getNamesTest method failed!", "", names[3]);
		// Tabi
		assertEquals("getNamesTest method failed!",
				"I'm Tabi! I don't really wanna think too hard about something cool to say about myself so I'll stop now.",
				names[4]);
	}

}
