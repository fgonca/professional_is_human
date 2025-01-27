package professional_is_human;

public class Main {

	public static void main(String[] args) {
		Human h = new Human("Ngola");
		Job j = new Job();
		Professional p = new Professional(h, "Engineer");
		h.doSomething();
		h.doSomethingVital();
		p.signContract(j);
		p.doTheJob();
		p.doSomething();
		p.doSomethingVital();
	}

}
