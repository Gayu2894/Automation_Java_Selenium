package java_Program_Basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		//HashSet mySet=new HashSet();
		Set s =new HashSet();
		//Set<String> s= new HashSet<String>();
		s.add("Gayu");
		s.add(null);
		s.add("yyy");
		s.add(123);
		s.add(true);
		s.add('A');
		s.add(null);
		s.add('A');
		s.add(true);
		s.add(123);
		System.out.println("HashSet elemnents are: "+s);
		
		//removing element
		s.remove("yyy");
		System.out.println("After Removing: "+s);
		
		System.out.println("Size of an HastSet elements are "+s.size());
	
	    //Inserting an element -not possible
		
		//Accessing a specific element from a Hashset is also not possible - indexing technique impossible
		
		//But by converting Hashset to ArrayList we can retrieve an element since ArrayList follows the indexing concepts
		ArrayList al=new ArrayList(s);
		System.out.println("Coverted HashSet Elements to ArrayList Elements: "+al);
		System.out.println(al.get(2));
		
		System.out.println("Size of a Coverted HashSet Elements to ArrayList Elements: "+al.size());
		
		//Reading all the data from the HastSet - Using only enhanced forloop
		System.out.println("HashSet elements are ");
		for(Object x:s)
		{
			System.out.println(x);
		}
		
		//Using Iterator method - Reading all the elements from HashSet
		
		Iterator it=s.iterator();
		
		System.out.println("Using Iterator: ");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//converted hashset to arraylist - reading an element using normal forloop
        System.out.println("Converted HashSet Values to ArrayList Values :");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//To clear all the elements from the Hashset
		s.clear();
		System.out.println(s);
		//to check HashSet is empty or not
       System.out.println("Checking the element present or not: "+s.isEmpty());		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       
        
        
	
	
	
	
	
	
	
	}

}
