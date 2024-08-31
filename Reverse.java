package proj;

public class Reverse 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[] = {12,43,31,65,21};
		int sum;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			sum = 0;
			temp = a[i];
			while(temp != 0)
			{
				int rem = temp % 10;
				sum = sum*10 + rem;
				temp = temp / 10;
			}
			System.out.print(sum + " ");
		}
	}

}
