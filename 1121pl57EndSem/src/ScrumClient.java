import java.util.ArrayList;


public class ScrumClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sprint sprint = new Sprint(5);
		ArrayList<String> stitle_array = new ArrayList<String>();
		stitle_array.add("As a member i want to register myself");
		stitle_array.add("As a admin i want to set rules");
		Story story = new Story(sprint, stitle_array, 1, 3);
		Task task1 = new Task(story, "UI for registration");
		TeamMember tm1 = new Member("Peter", task1);
		TeamMember tm2 = new Member("Nadia", task1);
		Project project = new Project("Online Voting System");
		Team team = new Team("Team1", 20, project);
		System.out.println("Team: "+team.getTeam_name());
		System.out.println("Team Project: "+team.getProject().getProject_name());
	}

}
