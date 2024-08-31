package proj;
import java.util.*; 
public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0)
		{
			int rem = temp%10;
			sum = sum*10 + rem;
			temp = temp/10;
		}
		if(sum==num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not an palindrome");
		}
	}	
}
