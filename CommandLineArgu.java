package proj;
import java.util.*;
public class CommandLineArgu 
{

	public static void main(String[] arg) 
	{
		// TODO Auto-generated method stub
		//System.out.println(args[0]);
//		System.out.println(arg.length);
		
//		String s1 = arg[0];
//		String s2 = arg[1];
//		System.out.println(s1 + s2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to add :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println(a + " + " + b +  " = " + c);	
	}
} 
