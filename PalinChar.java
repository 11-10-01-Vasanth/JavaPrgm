package proj;
import java.util.*;
public class PalinChar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = "";
		for(int i =s.length()-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		}
		if(str.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.print("Not");
		}
	}

}
