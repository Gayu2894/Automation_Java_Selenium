package java_Program_Basic;

public class ObjectArray {

	public static void main(String[] args) {
		
		
		//Heterogenous - Store multiple values in single variable which is a object data type
		Object a[]= {100,10.5,'A',"Welcome",true};
       /* for(Object x:a)
        {
        	System.out.println(x);
        }*/
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}