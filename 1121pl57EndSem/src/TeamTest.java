import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {

	Team team;
	Project project;
	
	@Before
	public void setUp() throws Exception {
		project = new Project("Online Voting System");
		team = new Team("Team1", 12, project);
	}

	@Test
	public void testVelocity() {
		assertEquals(12, team.getVelocity());
	}

}
