package professional_is_human;

// 𝘼 𝙥𝙧𝙤𝙛𝙚𝙨𝙨𝙞𝙤𝙣𝙖𝙡 𝙞𝙨 𝙖 𝙝𝙪𝙢𝙗𝙡𝙚 𝙝𝙪𝙢𝙖𝙣 𝙨𝙝𝙞𝙣𝙣𝙞𝙣𝙜 𝙖𝙨 𝙖 𝙡𝙖𝙢𝙥💡𝙘𝙤𝙣𝙣𝙚𝙘𝙩𝙚𝙙 𝙩𝙤 𝙩𝙝𝙚 𝙥𝙤𝙬𝙚𝙧🔋.
// - They are born from a human;
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
	
	
	// - they refrain from doing some things they can do as human beings, 𝘰𝘷𝘦𝘳𝘳𝘪𝘥𝘪𝘯𝘨, but;
	
	public void doSomething() 
	{
		this.doMoreThanInContract();
	}
	
	// - they do more for an organization than what is in the job contract.
	private void doMoreThanInContract() 
	{
		System.out.printf("%s %s is doing more than what is in the contract\n", 
				this.profession, this.name);
	}	
}
