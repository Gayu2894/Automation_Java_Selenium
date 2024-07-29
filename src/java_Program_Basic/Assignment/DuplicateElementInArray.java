package java_Program_Basic.Assignment;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,9,5,2,9};
		System.out.println("Given numbers are ");
		int repeatElement= 1;
		int count=0;
		boolean status=false;
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
			if(a[i]==repeatElement)
			{
				status=true;
				count++;
				System.out.println(repeatElement+" is "+count+ " times repeated");
			}
		}
		
		System.out.println();*/
		
		
	/*	if(status==false)
		{
			System.out.println("Given element is not present");
		}
		*/
		for(int x:a)
		{
			System.out.print(x+ " ");
			if(x==repeatElement)
			count++;
		}
		System.out.println();
		System.out.println(count+ " times repeated");
	}

}
