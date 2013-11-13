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
		Task task2 = new Task(story, "Test Case for registration");
		

		ArrayList<TeamMember> teams = new ArrayList<TeamMember>();
		TeamMember tm1 = new Member("Peter", task1);
		TeamMember tm2 = new ProductOwner("Nadia", task2);
		TeamMember tm3 = new ScrumMaster("Krishna");
		teams.add(tm1);
		teams.add(tm2);
		teams.add(tm3);
		Project project = new Project("Online Voting System");
		Team team = new Team("Team1", 20, project, teams);
		System.out.println("Team: "+team.getTeam_name());
		System.out.println("Team Members: ");
		for(int i=0; i<team.getTeams().size(); i++)
		{
			System.out.print("\t"+team.getTeams().get(i).getName());
			System.out.print("\t"+team.getTeams().get(i).getClass());
			System.out.println();
		}
		System.out.println("Team Project: "+team.getProject().getProject_name());
		System.out.println("Sprint 1 Duration: "+ sprint.getDuration());
		System.out.println("Sprint 1 Stories: ");
		for(int i=0; i<story.getStitle_array().size(); i++)
		{
			System.out.println("\t"+story.getStitle_array().get(i));
		}
		System.out.println("Adding a new Story to the list...");
		story.addStitle_array("As a member i want to cast my vote");
		System.out.println("Sprint 1 Updated Stories: ");
		for(int i=0; i<story.getStitle_array().size(); i++)
		{
			System.out.println("\t"+story.getStitle_array().get(i));
		}
		
		
	}

}
