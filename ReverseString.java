package proj;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vasanth";
		char revstr[] = new char[str.length()];
		int index = 0;
			
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr[index++] = str.charAt(i);
		}
		
		System.out.println(revstr);
		
		String st = "Welcome,To,Java";
		String s[] = st.split(",");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		//System.out.print(s);
	}

}
