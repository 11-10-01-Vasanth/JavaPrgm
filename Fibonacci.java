package proj;

public class Fibonacci {
	public static int fb(int a, int b, int c) {
		if (c > 2) {
			int k = a + b;
			c--;
			System.out.print(k+" ");
			return fb(b, k, c);
		}
		return 0;
	}

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		fb(a, b, 10);
	}
}


//package proj;
//
//public class Fibonacci {
//	public static int fb(int a, int b, int c) {
//		while(c > 2) {
//			int k = a + b;
//			a = b;
//			b = k;
//			c--;
//			System.out.print(k+" ");
//		}
//		return 0;
//	}
//
//	public static void main(String[] args) {
//		int a = 0;
//		int b = 1;
//		System.out.print(a+" "+b+ " ");
//		fb(a, b, 10);
//	}
//}

