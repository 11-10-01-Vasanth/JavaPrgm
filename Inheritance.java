package proj;

class A1
{
	public void display()
	{
		System.out.println("A1");
	}
}

class A2 extends A1
{
	public void display()
	{
		System.out.println("A2");
	}
}

class A3 extends A2
{
	public void display()
	{
		System.out.println("A3");
	}
}

public class Inheritance {
	
	public static void main(String[] args)
	{
		A2 c = new A2();
		c.display();
	}
	
}
