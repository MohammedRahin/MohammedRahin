import java.util.ArrayList;

public class Person
{
private int Age;
private String Name;
private String JobTitle;

public Person (String Name, String JobTitle, int Age)
{
	this.Name = Name;
	this.JobTitle = JobTitle;
	this.Age = Age;
	
}
public int getAge() {
	return Age;
}
public void setAge(int Age) {
	this.Age = Age;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getJobTitle() {
	return JobTitle;
}
public void setJobTitle(String jobTitle) {
	JobTitle = jobTitle;
}


@Override
public String toString() {
	return "Person [Age=" + Age + ", Name=" + Name + ", JobTitle=" + JobTitle + "]";
}
public static void main (String [] args)
{
	Person one = new Person("james", "IT Consultant", 16);
	Person two = new Person("Amir", "Consultant", 26);
	Person three = new Person("khan", "Teacher", 28);
	
	
	ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add(one);
    arrayList.add(two);
    arrayList.add(three);
    System.out.println(arrayList);
    
    for (int i = 0; i < arrayList.size(); i++)
    	      {
    	          arrayList.get(i).toString();
    	        }
    	     

	}


}



