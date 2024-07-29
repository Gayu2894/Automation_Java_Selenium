package java_Program_Basic;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//declaring array
	/*	int [][]a=new int[3][3];
		
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
		
		a[2][0]=700;
		a[2][1]=800;
		a[2][2]=900;
		*/
		
		//Approach 2:
		
		int a[][]= {{100,200,300},{400,500,600},{700,800,900}};
	    System.out.println("The Length of an array " +a.length);
	    System.out.println("The length of a columns are "+a[0].length);
		/*for(int i=0;i<a.length;i++)
		{
		  for(int j=0;j<a.length;j++)
		  {
			  System.out.print(a[i][j]+" ");
		  }
		  System.out.println();
		}  */
		
	    //Advanced for loop
		for(int []arr:a)
		{
			for(int x:arr)
			{
				System.out.print(x +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
