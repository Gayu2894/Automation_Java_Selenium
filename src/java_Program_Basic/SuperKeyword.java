package java_Program_Basic;

class Animal
{
	String color="white";
	void eat()
	{
		System.out.println("eating...");
	}
}

class Dog extends Animal
{
	String color="Black";
	void  displayColor()
	{
		//System.out.println(color);
		System.out.println(super.color); // returns values of immediate parent class
	}	
	void eat()
	{
		System.out.println("eat");
		super.eat();// returns method of immediate parent class
	}
	
}

public class SuperKeyword {
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d = new Dog();
        d.displayColor();
        d.eat();
        System.out.println(d.color);
	}

}
