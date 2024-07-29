package java_Program_Basic;

public class Box_ConstructorOverloading {

	double h,w,l;
	Box_ConstructorOverloading()
	{
		/*h=0
		 * w=0
		 * l=0
		 */
		h=w=l=0;
	}
	Box_ConstructorOverloading(double h1,double w1,double l1)
	{
		h=h1;
		w=w1;
		l=l1;
	}
	Box_ConstructorOverloading(double d)
	{
		h=w=l=d;
	}
	double volume()
	{
		return h*w*l;
	}
	
}
