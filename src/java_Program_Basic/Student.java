package java_Program_Basic;

public class Student {

	int sid;
	String sname;
	char sgrade;
	
	void print()
	{
		System.out.println(sid+" "+sname+ " "+sgrade);
	}
	void setStudentData(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
	}
	//Constructor
	Student(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
	}
}
