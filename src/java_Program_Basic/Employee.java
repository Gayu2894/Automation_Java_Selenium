package java_Program_Basic;

public class Employee {
	//variables
	int eid;
	String ename;
	int esal;
	String ecity;
	
	void display()//methods
	{
		System.out.println("Emp id: " +eid);
		System.out.println("Emp Name: "+ename);
		System.out.println("Emp Salary: " +esal);
		System.out.println("Emp City : " +ecity);
	}
	

	/*public static void main(String[] args) {
	
		Employee emp1=new Employee();//object
		emp1.eid=12;
		emp1.ename="Gayu";
		emp1.esal=40000;
		emp1.ecity="Madurai";
		emp1.display();
		System.out.println(emp1.eid=12);
		
		System.out.println();
		
		Employee emp2=new Employee();
		emp2.eid=12;
		emp2.ename="Gayu";
		emp2.esal=40000;
		emp2.ecity="Madurai";
		emp1.display();
		}*/

}
