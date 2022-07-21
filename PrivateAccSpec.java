package phase1programs;

class aPrivateClass{
	
	private void output()
	{
		System.out.println("This is Private Access Specifier");
	}
}
public class PrivateAccSpec {

	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		aPrivateClass obj = new aPrivateClass();
		
		//obj.output();
		//Error - Cannot access method declared private of another class.
	}

}
