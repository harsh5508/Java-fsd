package phase1programs;

class aDefaultClass{
	
	void output()
	{
		System.out.println("This is default access specifier");
	}
}

public class DefaultAccSpec {

	public static void main(String[] args) {
		
		
		System.out.println("Default Accesss Specifier");
		aDefaultClass obj = new aDefaultClass();
		obj.output();
	}

}
