import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TeamMemberTest {
	Sprint sprint;
	TeamMember tm, tm2;
	Story story;
	Task task1;
	ArrayList<String> stitle_array;
	@Before
	public void setUp() throws Exception {
		sprint = new Sprint(5);
		stitle_array = new ArrayList<String>();
		stitle_array.add("As a member i want to register myself");
		stitle_array.add("As a admin i want to set rules");
		story = new Story(sprint, stitle_array, 1, 3);
		task1 = new Task(story, "UI for registration");
		tm = new Member("Melanie", task1 );
		tm2 = new ScrumMaster("Nadia" );
	}

	@Test
	public void testGetName() {
		assertEquals("Melanie", tm.getName());
	}

	@Test
	public void testGetTask() {
		assertEquals("UI for registration", tm.getTask().getTask_name());
	}

}
