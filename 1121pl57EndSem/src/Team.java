
public class Team {

	private String team_name;
	private int velocity;
	private Project project = new Project();

	public Team(String name, int v, Project project) {
		// TODO Auto-generated constructor stub
		this.team_name = name;
		this.velocity = v;
		this.project  = project;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
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
