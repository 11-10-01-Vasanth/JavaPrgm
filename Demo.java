package proj;

public class Demo {
	public static void main(String[] args) {
		System.out.println(2 % 10);
		System.out.println(2 / 10);
		System.out.println(123 / 10);
		System.out.println(1234 / 10 % 100);

		int num = 32554;
		String str = Integer.toString(num);
		
		System.out.println(str instanceof String);

		System.out.println(Integer.MAX_VALUE);

		System.out.println((5 / 2) + 1);
	}
}
