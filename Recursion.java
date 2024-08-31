package proj;

class C
{
	int fact(int a)
	{
		if(a==1)
		{
			return a;
		}
		else 
		{
			return a*fact(a-1);
		}
		
		
	}
}

public class Recursion {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		C c = new C();
		int res = c.fact(5);
		System.out.println(res);
	}

}
