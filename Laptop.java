package proj;
class Spec
{
	String processor = "i511";
	int ram = 16;
	int gpu = 4;
	String model = "lenovo";
	void gaming()
	{
		System.out.println("Good for gaming");
	}
	void multitasking()
	{
		System.out.println("Good for multitasking");
	}
	void performance()
	{
		System.out.println("Good");
	}
}
public class Laptop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Spec s = new Spec();
		s.gaming();
	}

}
