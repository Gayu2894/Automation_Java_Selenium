package java_Program_Basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
	
		
		//Declaration
		
		//HashMap hm =new HashMap(); // for storing heterogenous Key and value data / objects 
 		//Map hm=new HashMap(); // Map is an parent of hashmap Child  
		
		HashMap<String,Object> hm=new HashMap<String,Object>();
		hm.put("Name", "Gayu");
		hm.put("id", 100);
		hm.put("City", "Madurai");
		hm.put("Status", true);
		hm.put("Phone #", "12345678");
		hm.put("Name", "Nilan");
		System.out.println(hm);
		
		System.out.println("Size of a HashMap: "+hm.size());
		hm.remove("Status");
		System.out.println(hm);
		System.out.println("Size of a HashMap: "+hm.size());

		//retrieve value of key
		System.out.println("Retriving specific key: "+hm.get("City"));
		
		//To get only keys 
		System.out.println(hm.keySet());
		//To get only Values
		System.out.println(hm.values());
		//To get all the key and values
		System.out.println(hm.entrySet());
		
		//using enhanced for loop getting all the data
		
		System.out.println("Using enhanced for loop:");
		/*for(Object x:hm.entrySet())
		{
			System.out.println(x);
		}*/
		
		for(String s:hm.keySet())
		{
			System.out.println(s+"    "+hm.get(s));
		}
		
		
		//Using Iterator to get all the key and value pairs
		
		System.out.println("Using Iterator to get all the key and value pairs: ");
		
		Iterator <Entry <String, Object>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry entry=it.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
