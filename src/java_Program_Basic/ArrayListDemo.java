package java_Program_Basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Gayu");
		al.add(1234);
		al.add(1234);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add("Madurai");
		al.add('A');
		al.add(null);
		System.out.println("My ArrayList size is: "+al.size());
		System.out.println("My ArrayList is: "+al);
		System.out.println("Removing List is: "+al.remove(2));
		System.out.println("After Removing integer in list: "+al);
		System.out.println("My ArrayList size is: "+al.size());
		System.out.println("Removing List is: "+al.remove(3));
		System.out.println("After Removing integer in list: "+al);
		System.out.println("My ArrayList size is: "+al.size());
		
		//inserting
		al.add("King");
		al.add(2, "Tester");
		System.out.println(al);
		al.set(3, "Java");
		System.out.println(al);
		System.out.println(al.get(1));
		/*
		//Using Forloop to read all the data from the arraylist
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//Using enhanced forloop
		for( Object x: al)
		{
			System.out.println(x);
			
		}		
			*/
		
		//Using Iterator
		
		
		 //To check element empty or not
		System.out.println(al.isEmpty()); //returns true or false - here it is false since we have values in it

		 //To remove multiple elements from the list
		 ArrayList al2= new ArrayList();
		 al2.add("Madurai");
		 al2.add(null);
		
		al.removeAll(al2);
		System.out.println("final: "+al);
		 // To remove all the elements inthe array list 
		 al.clear();
		 System.out.println(al.isEmpty()); 
		 System.out.println("final: "+al);
		 
		 System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuu");
		 Iterator it=al.iterator();
		 System.out.println("ooooo"+it.next());
		 while(it.hasNext())
		 {
			 System.out.println("jjjjjjjj"+it.next());
		 }
		 
	 	 
		 
		
		
		
		
		
		
		
		
		
			
		}
		
		
		

	
}
