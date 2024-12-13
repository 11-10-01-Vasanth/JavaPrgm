package proj;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int pr = sc.nextInt();
		int count=0;
		for(int i=2;i<=pr;i++)
		{
			if(pr%i==0)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("Not an prime number");
		}
		else
		{
			System.out.println("Prime number");
		}
		
		System.out.println(String.format("%.3f",Math.sqrt(3)));
	}

}
