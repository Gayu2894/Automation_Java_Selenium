package java_Program_Basic;

public class SwitchCase {

	public static void main(String[] args) {
		
		//when multiple conditions are required, go for switch case instead using if else 
		
		int wnum=7;
		switch(wnum)
		{
     	   case 1:System.out.println("Monday");break;
     	   case 2:System.out.println("Tuesday");break;
     	   case 3:System.out.println("Wednesday");break;
     	   case 4:System.out.println("Thurday");break;
     	   case 5:System.out.println("Friday");break;
     	   case 6:System.out.println("Saturday");break;
     	   case 7:System.out.println("Sunday");break;
     	   default:System.out.println("Invalid Week number");
		}
			
	}

}
