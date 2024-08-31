package proj;
import java.util.*;
public class ElectricBill {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units : ");
		int eb = sc.nextInt();
		if(eb<=100)
		{
			System.out.println("No charges left");
		}
		else
		{
			if(eb>=101 && eb<=200)
			{
				eb-=100;
				eb*=2;
				System.out.println("Bill amount : " + eb);
			}
			if(eb>=201 && eb<=300)
			{
				eb-=200;
				eb*=3;
				eb+=200;
				System.out.println("Bill amount : " + eb);
			}
			if(eb>=301 && eb<=400)
			{
				eb-=300;
				eb*=4;
				eb+=500; 
				System.out.println("Bill amount : " + eb);
			}
			if(eb>=401)
			{
				eb-=400;
				eb*=5;
				eb=eb+900;
				System.out.println("Bill amount : " + eb);
			}
		}
	}

}
