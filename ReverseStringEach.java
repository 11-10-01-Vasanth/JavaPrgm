package proj;

public class ReverseStringEach {

	public static void main(String[] args)
	{
		String str = "emocleW oT avaJ";
		String revstr = "";
		String s[] = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String tempstr = s[i];
			String temprevstr = "";
			for(int j=tempstr.length()-1;j>=0;j--)
			{
				temprevstr = temprevstr + tempstr.charAt(j);
			}
			revstr = revstr + temprevstr + " ";
		}
		System.out.println(revstr);
	}

}
