package phase1programs;

public class TypeCasting {
public static void main(String[] args) {
		
		char var1 = 'H';
		System.out.println("Char var1 = "+ var1);
		System.out.println("Implicit Type Casting");
		
		double d1 = var1;
		float f1 = var1;
		long l1 = var1;
		int i1 = var1;
		
		System.out.println("Double value of var1 is  "+ d1);
		System.out.println("Float value of var1 is  "+ f1);
		System.out.println("Long value of var1 is  "+ l1);
		System.out.println("Int value of var1 is  "+ i1);
		
		System.out.println("\n");
		
		double var2 = 60.7; 
		System.out.println("Double var2 = "+ var2);
		System.out.println("Explicit Type Casting");
		
		float f2 = (float) var2;
		long l2 = (long) var2;
		int i2 = (int) var2;
		
		System.out.println("Float value of var2 is  "+ f2);
		System.out.println("Long value of var2 is  "+ l2);
		System.out.println("Int value of var2 is  "+ i2);
		}

}

