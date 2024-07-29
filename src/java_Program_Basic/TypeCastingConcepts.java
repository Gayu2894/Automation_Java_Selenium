package java_Program_Basic;

public class TypeCastingConcepts {

	public static void main(String[] args) {
	
		 //Upcasting -automatic process
		
		/* int intvalue=100;
		 long longvalue=intvalue; //assigning smaller value to larger value since long has more space 
         System.out.println(longvalue);
         */
		
		/*float floatvalue=10.3F;//need to assign with literal		
	    double doublevalue=floatvalue;
	    System.out.println("Upcasting---smaller value into larger value: "+doublevalue);
	    */
		
		//Downcasting -manually	----larger to smaller
		
		long longvalue=100055555;
		int intvalue=(int)longvalue; //we cano
	    System.out.println(intvalue);
	    
	    double d=10.5;
	    int i=(int)d;
	    System.out.println(i);// decimal has reduced here this is the problem with downcasting
	    
	
	
	
	
	
	
	
	}

}
