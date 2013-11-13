import java.util.ArrayList;


public class ScrumClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sprint sprint = new Sprint(5);
		ArrayList<String> stitle_array = new ArrayList<String>();
		stitle_array.add("As a member i want to register myself");

		Story story = new Story(sprint, stitle_array, 1, 3);
		Task task1 = new Task(story, "UI for registration");
		Task task2 = new Task(story, "Test Case for registration");
		ArrayList<Task> taskarray = new ArrayList<Task>();
		taskarray.add(task1);
		taskarray.add(task2);
		ArrayList<TeamMember> teams = new ArrayList<TeamMember>();
		TeamMember tm1 = new Member("Peter", task1);
		TeamMember tm2 = new ProductOwner("Nadia", task2);
		TeamMember tm3 = new ScrumMaster("Krishna");
		teams.add(tm1);
		teams.add(tm2);
		teams.add(tm3);
		ArrayList<Task> todo = new ArrayList<Task>();
		ArrayList<Task> done = new ArrayList<Task>();
		
		ScrumBoard sb = new ScrumBoard(todo, taskarray, done);
		Task task3 = new Task(story, "Code for registration");
		
		Project project = new Project("Online Voting System", sb);
		project.getSb().addTodo(task3);
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
			System.out.println("\t"+team.getTeams().get(i).getTask().getStory().getStitle_array().get(i));
			for(int j=0; j<2; j++)
			{
			
				System.out.println("\t\t"+team.getTeams().get(j).getTask().getTask_name()+"\t"+team.getTeams().get(j).getName());
			}
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
