package java_Program_Basic;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		//Example:1 - Print 1 to 10
		
		/*int i=1;     //Initialization
		while(i<=10) //condition
		{
			System.out.println("Print " +i);
			i++;   //inc/dec
		}*/
		
		//Example:2 - Print hello message 10 times 
		
		/*int i=0;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}	*/
		
		//Example:3 - print even number btw 1 to 10 , 2,4,6,8
		/*int i=1;
		while(i<=10)
		{
			if(i%2==0)
			System.out.println(i);
			i++;
		}*/
		/*int i=2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;//i=i+2
		}*/
		
		//Example:4 - print odd and even number btw 1 to 10
		/*int i=1;
		while(i<=10)
		{
			if(i%2==0)
	        System.out.println(i +" is even number");
			else
			System.out.println(i +" is odd number");
			i++;
		}*/
		//Example: 5 Print 1 to 10 in descending order
		/*int i=6;
		while(i>=1)
		{
			
			System.out.println(i);
			i--;
		}*/
		//while loop without using the condition
		int i=1;
		while(true)
		{
			System.out.println(i);
			i++;
			if(i==11)
			break;	
		}
			
		
		
}

}














