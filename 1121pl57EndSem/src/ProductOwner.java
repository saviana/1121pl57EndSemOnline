
public class ProductOwner extends TeamMember {

	public ProductOwner(String string, Task task1) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.task = task1;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Task getTask() {
		// TODO Auto-generated method stub
		return task;
	}

}
