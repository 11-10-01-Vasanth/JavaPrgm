package proj;

import java.util.*;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		int temp = num;
		int sum = 0;
		int power = 0;
		while(temp!=0) {
			power++;
			temp /= 10;
		}
		System.out.println(power);
		temp = num;
		while(temp!=0) {
			int rem = temp%10;
			sum = sum + (int)Math.pow(rem, power);
			temp/=10;
		}
		System.out.println(9/10);
		int a = 10;
		double b = a;
		
		
	}
}
