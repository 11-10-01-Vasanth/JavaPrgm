package proj;
import java.util.*;
public class Prgm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		Set<Character> s = new TreeSet<Character>();
		for(char i : ch)
		{
			s.add(i);
		}
		System.out.println(s);
	}

}
