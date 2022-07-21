package phase1programs;

public class Constructor {
	
	int serialno;
	String subject;
	
	Constructor()
	{
		System.out.println("Default Constructor");
		System.out.println("Student with Serail No." + serialno +" Study " + subject + "\n");
		 
	}
	
	Constructor(int i, String j)
	{
		System.out.println("Parameterized Constructor");
		serialno = i;
		subject = j; 
		System.out.println("Student with Serail No." + serialno +" Study " + subject);
	}
	
	
	public static void main(String[] args) {
		
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor(1, "JAVA");
		

	}

}
