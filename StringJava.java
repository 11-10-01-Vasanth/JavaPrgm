package proj;

public class StringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vasanth";
		System.out.println(s.substring(0,s.length()));
		for(int i=1;i<=s.length();i++)
		{
			System.out.println(s.substring(s.length()-i));
		}
		
	}

}
