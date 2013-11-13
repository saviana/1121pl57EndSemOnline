
public class Task {

	private Story story = new Story();
	private String task_name;

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public Task(Story story, String task) {
		// TODO Auto-generated constructor stub
		this.story  = story;
		this.task_name = task;
	}

}
