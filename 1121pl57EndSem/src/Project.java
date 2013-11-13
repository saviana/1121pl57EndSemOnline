
public class Project {

	private String project_name;
	private ScrumBoard sb = new ScrumBoard() ;

	public ScrumBoard getSb() {
		return sb;
	}

	public void setSb(ScrumBoard sb) {
		this.sb = sb;
	}

	public Project(String name, ScrumBoard sb) {
		// TODO Auto-generated constructor stub
		this.project_name = name;
		this.sb = sb;
	}

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

}
