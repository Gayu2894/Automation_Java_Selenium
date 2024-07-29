package java_Program_Basic;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
	
		String a= "Gayathri";
		//length()
		System.out.println(a.length());
		System.out.println("Gayathri".length());
		
		//concat() - Joining strings
		String s1= "Welcome";
		String s2= " to Java";
		String s3= " Automation";
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println("welcome".concat(" to java"));
		
		System.out.println(s1.concat("gayu"));
		System.out.println(s1);
		
		//trim() - remove spaces right and left side
		String s4= "    Nilan   ";
		System.out.println(s4);
		System.out.println("Before trimming: "+s4.length());
		System.out.println("After Triming: "+s4.trim());
		System.out.println(s4.trim().length());
		System.out.println(s4.trim());
		
		//CharAt()-return particular based on index value
		String s ="gayu";
		String s5 = "Gayu";
		System.out.println(s.charAt(2));
		
		//Contains()- check particular string is part of a main string or not 
		s.contains("gau");
		System.out.println(s.contains("gau"));//sequence is missing 
		
		//equals() equalsIgnoreCase() - compare strings
		System.out.println(s.equalsIgnoreCase(s5));
		System.out.println(s.equals(s5));
		System.out.println(s==s5);
		
		//Replace() - Replace single or multi (sequence)
		String m= "come to office okay to";
		System.out.println(m.replace('o', 'l'));
		System.out.println(m.replace("to", "for").replace('f', 'r'));
		
		//substring()- extract substring from main string 
		
		String n= "Gayathri";
		System.out.println(n.substring(5, 7));
		
		//toUpperCase() toLowerCase() - change completely to upper and lower case
		
		String x= "mango";
		String x1= "MAnGO";
		System.out.println(x1.toUpperCase());
		System.out.println(x1.toLowerCase());
		
		//split() - split the string into multiple parts based on delimeter ( some special character)
		
		String d = "Gayu123@gmail.com";
		String f[]= d.split("@");
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(d.split("@")));
		
		//Ex1
		String amount ="$15,20,55";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		//Ex2
		String q="abc,123@xyz"; // [abc 123 xyx]
		String r[]=q.split(",");
		System.out.println(r[0]);
		System.out.println(r[1]);
        String i=r[1];
        String g[] =i.split("@");
        System.out.println(g[0]);
        System.out.println(g[1]);
        System.out.print(r[0]+" "+g[0]+" "+g[1]);
        
        //Ex3 - cannot use some character as delimiter * % ^ & ( )
        String h="abc 123";
        String t[]=h.split(" ");
        System.out.println();
        System.out.println(Arrays.toString(t));
        
        //Ex4- 
        String name="Jack";
        System.out.println(name.replace('J', 'j').contains("jack"));
        System.out.println(name.toLowerCase().contains("jack"));
		

		
	}

}
