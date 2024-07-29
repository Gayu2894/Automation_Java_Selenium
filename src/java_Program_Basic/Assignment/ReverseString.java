package java_Program_Basic.Assignment;

public class ReverseString {

	public static void main(String[] args) {

      //Approach 1
		
		/*String s="Welcome";
		// s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
       System.out.println("Reverse String: "+rev);
       */
		
       //Approach 2 -by converting string to charArray
       
       String d="Gayathri";
       String rev="";
       char a[]=d.toCharArray();
       for(int i=a.length-1;i>=0;i--)
       {
    	 rev=rev+a[i];  
       }
       System.out.println(rev); 
        
		
		//Approach 3: using builtin methods
		
		//StringBuffer b=new StringBuffer("nilan");
		//System.out.println(b.reverse());
		
		
		//Approach4:
		
		//StringBuilder b=new StringBuilder("nilan");
       // System.out.println(b.reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       
       
       
       
	}

}
