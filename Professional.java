package professional_is_human;

// With their body and soul connected to Life,
public class Professional extends Human
{
	private String name;
	private String profession;
	private Contract contract;
	
	Professional (Human h, String profession)
	{
		super(h.getName());
		this.name = h.getName();
		this.profession = profession;
	}

	public void signContract(Contract contract)
	{
		this.contract = contract;
		System.out.printf("%s %s signed the contract\n", this.profession, this.name);
	}
	
	//They go down to do a job according to the contract;
	public void doTheJob()
	{
		contract.doTheWork(this.profession, this.name);
	}
	
	
	// They refrain from doing some things they can do as human beings, overriding, but;
	
	public void doSomething() 
	{
		this.doMoreThanInContract();
	}
	
	// Do more than what is in the contract.
	private void doMoreThanInContract() 
	{
		System.out.printf("%s %s is doing more than what is in the contract\n", 
				this.profession, this.name);
	}	
}
