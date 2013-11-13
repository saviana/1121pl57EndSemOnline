import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class StoryTest {

	Story story;
	Sprint sprint;
	ArrayList<String> stitle_array;
	@Before
	public void setUp() throws Exception {
		sprint = new Sprint(5);
		stitle_array = new ArrayList<String>();
		stitle_array.add("As a member i want to register myself");
		story = new Story(sprint, stitle_array, 1, 3);
	}

	

	@Test
	public void testGetSprint() {
		assertEquals(5, story.getSprint().getDuration());
	}

	@Test
	public void testGetStitle_array() {
		assertEquals("As a member i want to register myself", story.getStitle_array().get(0));
	}

	

}
