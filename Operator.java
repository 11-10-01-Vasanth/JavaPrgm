package proj;

public class Operator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x = 10 , y = 5;
		
		//binary value for 5 is 101
		//binary value for 10 is 1010
		
		System.out.println( !( (x<5)||(y>10) ) );
		
		System.out.println(y<<2);    // 101 --> 10100
		
		System.out.println(x>>2);	 // 1010 --> 10
		
		if(x==10 && y==5 && x>5)
		{
			System.out.print("\n Hi");
		}
		
	}

}
