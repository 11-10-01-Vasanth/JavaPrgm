package proj;
import java.util.*;

public class List1 {
	
	public static void main(String[] args)
	{
		int a[] = { 2, 4, 1, 6, 6, 7, 5, 3, 6, 6, 3, 4, 6, 3, 4, 6, 3, 4 };
		Set<Integer> s = new HashSet<Integer>();
		for(int i : a)
		{
			s.add(i);
		}
		System.out.println(s);
	}

}
