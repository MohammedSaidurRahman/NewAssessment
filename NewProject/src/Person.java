
public class Person {
	
	private String name;
	
	private String age;
	
	private String jobTitle;

	public Person(String name, String age, String jobTitle)
	{
		this.setName(name);
 		this.setAge(age);
		this.setJobTitle(jobTitle);

		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public String toString()
	{
		return "Name: " + name + "Age: " + age + "Job Title: " + jobTitle; 
	}
	
	


}