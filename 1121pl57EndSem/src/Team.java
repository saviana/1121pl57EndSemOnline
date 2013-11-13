import java.util.ArrayList;


public class Team {

	private String team_name;
	private int velocity;
	private Project project = new Project();
	ArrayList<TeamMember> teams = new ArrayList<TeamMember>();

	public Team(String name, int v, Project project, ArrayList<TeamMember> teams) {
		// TODO Auto-generated constructor stub
		this.team_name = name;
		this.velocity = v;
		this.project  = project;
		this.teams = teams;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public ArrayList<TeamMember> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<TeamMember> teams) {
		this.teams = teams;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
