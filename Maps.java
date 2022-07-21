package phase1programs;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		  HashMap<Integer,String> a =new HashMap<Integer,String>();    //1. HASHMAP  
	      a.put(1,"Java");    
	      a.put(2,"Python");    
	      a.put(3,"C");   
	      System.out.println("Elements of Hashmap ");  
	        for(Map.Entry<Integer,String> m : a.entrySet()){    
	                System.out.println(m.getKey()+" "+m.getValue());    
	        }
	      
	      System.out.println("\n");
	         
	      Hashtable<Integer,String> b =new Hashtable<Integer,String>();  //2. HASHTABLE
	      b.put(1,"Ayush");  
	      b.put(2,"Piyush");  
	      b.put(3,"Dev");  
	      System.out.println("Elements of HashTable");  
            for(Map.Entry<Integer,String> n : b.entrySet()){    
	                System.out.println(n.getKey()+" "+n.getValue());    
	        }
	      
	      
          System.out.println("\n");
	      
	      TreeMap<Integer,String> c = new TreeMap<Integer,String>();   //3. TREEMAP 
	      c.put(1,"CSA");    
	      c.put(3,"TOC"); 
	      c.put(2,"DS");
	      System.out.println("Elements of TreeMap ");  
	        for(Map.Entry<Integer,String> o : c.entrySet()){    
	                System.out.println(o.getKey()+" "+o.getValue());    
	        }    
	}

}
