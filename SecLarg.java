package proj;
import java.util.*;

public class SecLarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<temp;j++)
			{
				if(j < num-1)
				{
					if(i+j >= num-1)
					{
						count++;
						System.out.print(count);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					count--;
					System.out.println(count);
				}
			}
			temp = temp + 1;
			System.out.println();
		}
	}

}
