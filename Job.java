package professional_is_human;

public class Job implements Contract{
	public void doTheWork(String profession, String name) {
		System.out.printf("%s %s is doing the work defined in the contract\n", 
				profession, name);
	}
}
