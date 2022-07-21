package phase1programs;

public class Methods {

   void A(int i, int j) //Call by value method
    {
          System.out.println("Call By Value"); 
          i = i/10;
          j = j/10;          
          
    }
   int a, b;
   void A(Methods o)  //Call by reference method
   {   
	   System.out.println("Call By Reference");
	   o.a = o.a * 1000;
	   o.b = o.b*1000;
   }
   
   //Both method have same name but different parameter.
   //So method overloading is also demonstrated.
public static void main(String args[]) {
	
	Methods obj1 = new Methods();
	int x = 100, y = 200;
	System.out.println("Value of x = " + x + " Value of y =" + y);
	System.out.println("Function called");
	obj1.A(x,y);	
	System.out.println("After Function called, Value of x = " + x + " Value of y =" + y);
	System.out.println("\n");	
	
	Methods obj2 = new Methods();
	int a, b;
	obj2.a = 5;
	obj2.b = 7;
	System.out.println("Value of a = " + obj2.a + " Value of y =" + obj2.b);
	System.out.println("Function called");
	obj2.A(obj2);
	System.out.println("After Function called, Value of a = " + obj2.a + " Value of y =" + obj2.b);
  }
}


