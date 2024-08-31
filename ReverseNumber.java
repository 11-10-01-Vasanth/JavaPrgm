package proj;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 23,43,56 };
		for(int i=0;i<a.length;i++)
		{
			int n = a[i];
			int temp = n;
			while(temp>0)
			{
				int r = temp%10;
				System.out.print(r);
				temp=temp/10;
			}	
			System.out.print(" , ");
		}
		
	}

}
