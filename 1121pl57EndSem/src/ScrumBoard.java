import java.util.ArrayList;


public class ScrumBoard {
	public ScrumBoard(ArrayList<Task> todo2, ArrayList<Task> taskarray,
			ArrayList<Task> done2) {
		// TODO Auto-generated constructor stub
		this.done=done2;
		this.todo=todo2;
		this.wip=taskarray;
	}
	public ScrumBoard() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Task> getTodo() {
		return todo;
	}
	public void addTodo(Task t) {
		this.todo.add(t);
	}
	public ArrayList<Task> getWip() {
		return wip;
	}
	public void addWip(Task wip) {
		this.wip.add(wip);
	}
	public ArrayList<Task> getDone() {
		return done;
	}
	public void addDone(Task done) {
		this.done.add(done);
	}
	private ArrayList<Task> todo = new ArrayList<Task>();
	private ArrayList<Task> wip = new ArrayList<Task>();
	private ArrayList<Task> done = new ArrayList<Task>();
	
}
