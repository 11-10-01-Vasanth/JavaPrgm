package proj;
import java.util.*;
public class Prgm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int len = ch.length;
		int count=0;
		for(int i=0;i<len;i++)
		{
			count=0;
			for(int j=0;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
				else
				{
					System.out.print(count);
					System.out.print(ch[i]);
				}
			}
			
		}
		
	}

}
