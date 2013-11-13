import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TeamTest {

	Team team;
	Project project;
	ArrayList<TeamMember> teams;
	TeamMember tm1, tm2, tm3;
	Task task1;
	Story story;
	Sprint sprint;
	ArrayList<String> stitle_array;
	
	
	@Before
	public void setUp() throws Exception {
		sprint = new Sprint(5);
		stitle_array = new ArrayList<String>();
		stitle_array.add("As a member i want to register myself");
		stitle_array.add("As a admin i want to set rules");
		story = new Story(sprint, stitle_array, 1, 3);
		teams = new ArrayList<TeamMember>();
		task1 = new Task(story, "UI for registration");
		tm1 = new Member("Peter", task1);
		tm2 = new ProductOwner("Nadia", task1);
		tm3 = new ScrumMaster("Krishna");
		teams.add(tm1);
		teams.add(tm2);
		teams.add(tm3);
		project = new Project("Online Voting System");
		team = new Team("Team1", 12, project, teams);
	}

	@Test
	public void testVelocity() {
		assertEquals(12, team.getVelocity());
	}

}
