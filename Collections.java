package phase1programs;

import java.util.*;

public class Collections{

	public static void main(String[] args) {
		
		ArrayList<String> subjects = new ArrayList<>(); //Array List
        subjects.add("Physics");     // Add elements
        subjects.add("Chemistry");
        subjects.add("Maths");
        subjects.add("English");
        subjects.add("Computer Science");
        System.out.println("Array List: " + subjects);

        System.out.println("\n");
        
        Vector<Integer> marks = new Vector(); //Vector
        marks.addElement(80); //Add Elements 
	    marks.addElement(65);
	    marks.addElement(49);
	    marks.addElement(85);
	    marks.addElement(38); 
	    System.out.println("Vector " + marks);
	    
	    System.out.println("\n");

        LinkedList<String> list =new LinkedList<String>(); //Linked List
        list.add("Milk");  //Add Elements
        list.add("Butter");
        list.add("Cheese");
        list.addFirst("Sauce");
        System.out.println("Linked List : " + list);
                
        System.out.println("\n");
        
        Stack<String> stack = new Stack<String>();  //Stack
        stack.push("Java");  //Push Element
        stack.push("Python");  
        stack.push("Cloud");  
        stack.push("Devops");  
        stack.push("mySQL");  //Pop Element
        stack.pop();  
        System.out.println("Stack :");
        Iterator<String> iterator2=stack.iterator();
        while(iterator2.hasNext()){
          
        	System.out.println(iterator2.next());
	    
          }
               
        System.out.println("\n");
        
        HashSet<String> components = new HashSet<String>();  //Hash Set
        components.add("CPU");
        components.add("Monitor");
        components.add("Console");
        components.add("Keyboard");
        components.add("Mouse");
        components.add("Mouse"); // Duplicate Values not allowed
        components.add("UPS");
        components.remove("Console");
        System.out.println("HashSet: " + components);
        
        System.out.println("\n");
        
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>(); //Linked Hash Set
        lhset.add(1);
        lhset.add(3);
        lhset.add(5);
        lhset.add(7);
        lhset.add(9);
        lhset.add(5); //Duplicates value not allowed

        System.out.println("Linked Hash Set : " + lhset);
   }
}
