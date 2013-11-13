import java.util.ArrayList;


public class Story {

	private Sprint sprint = new Sprint();
	private ArrayList<String> stitle_array = new ArrayList<String>();
	private int priority;
	private int story_point;

	public Story(Sprint sprint, ArrayList<String> title, int p, int sp) {
		// TODO Auto-generated constructor stub
		this.sprint  = sprint;
		this.stitle_array = title;
		this.priority = p;
		this.story_point = sp;
		
	}

	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}

	public ArrayList<String> getStitle_array() {
		return stitle_array;
	}

	public void addStitle_array(String string) {
		this.stitle_array.add(string);
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getStory_point() {
		return story_point;
	}

	public void setStory_point(int story_point) {
		this.story_point = story_point;
	}

	public Story() {
		// TODO Auto-generated constructor stub
	}

}
