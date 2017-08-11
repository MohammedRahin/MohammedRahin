
public class WorkingWithFiles {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	private String Occupation;
	private int Age;
	
	public WorkingWithFiles(String name, String occupation, int age) {
		super();
		this.name = name;
		Occupation = occupation;
		Age = age;
	}

	@Override
	public String toString() {
		return "WorkingWithFiles [name=" + name + ", Occupation=" + Occupation + ", Age=" + Age + "]";
	}
	
	


}
