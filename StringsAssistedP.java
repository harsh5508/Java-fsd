package phase1programs;

public class StringsAssistedP {

	public static void main(String[] args) {
		
		//StringBuilder
		System.out.println("String Builder");
		StringBuilder a = new StringBuilder("Java");
		
		a.append("Programming");
		
		System.out.println(a);

		System.out.println(a.delete(0, 4));
		
		System.out.println(a.insert(0, "WelcomeTo"));

		System.out.println(a.reverse());
		
		System.out.println("\n");
		
		//conversion	
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str1 = "Ice"; 
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str1); 
        System.out.println("String to String Buffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbd = new StringBuilder(str1); 
        sbd.append("Cream"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbd); 
                
        
        //Length
		String sl=new String("Hello World");
		System.out.println(sl.length());

		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		//String Comparison
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);

		//equals
		String x="Welcome to Programming";
		String y="WeLcOmE tO Programming";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Keep Coding");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
	}

}
