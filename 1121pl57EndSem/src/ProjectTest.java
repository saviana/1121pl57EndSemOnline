import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ProjectTest {

	Project project1;
	@Before
	public void setUp() throws Exception {
	project1 = new Project("Online Voting System");
	}

	@Test
	public void testProjectName() {
		assertEquals(project1.getProject_name(), "Online Voting System");
	}

}
