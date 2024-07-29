package java_Program_Basic.Assignment;

public class LinearSearchInArray {

	public static void main(String[] args) {
	 
		 int a[]= {1,2,3,4,5};
		 int searchElement=4;
		 boolean status=false;
		/* for(int i=0;i<a.length;i++)
		 {
			 if(searchElement==a[i])
			 {
			   System.out.println("Given number is found in Array");
			   status=true;
		       break;
			 }
		 }
		 if(status==false)
		 {
			  System.out.println("Given number is not found in Array");
			
		 }*/
		 for(int x:a)
		 {
			 if(searchElement==x)
			 {
				 System.out.println("Given number is found in Array");
				   status=true;
			       break; 
			 }
		 }
		 if(status==false)
		 {
			  System.out.println("Given number is not found in Array");
			
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
