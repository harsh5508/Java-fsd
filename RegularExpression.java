package phase1programs;

import java.util.regex.*;

public class RegularExpression {

	public static void main(String[] args) {
		String pattern = "[a-z,A-Z,0-9]+";
		
		String check = "This is Java  @@##$$%%@01234 Programming";
		
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );


	}

}
