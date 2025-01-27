package professional_is_human;

public class Human {
	private String name;
	
	Human (String name)
	{
		this.name = name;
	}
	public void doSomething() {
		System.out.println(name + " is doing something a human do.");
	}
	
	public void doSomethingVital() {
		System.out.println(name + " is doing something vital to a human.");
	}
	
	public String getName()
	{
		return this.name;
	}
}
