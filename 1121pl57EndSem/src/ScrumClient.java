
public class ScrumClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project project = new Project("Online Voting System");
		Team team = new Team("Team1", 12, project);
		System.out.println("Team: "+team.getTeam_name());
		System.out.println("Team Project: "+team.getProject().getProject_name());
	}

}
