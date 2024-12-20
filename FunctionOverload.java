package proj;

class Funcoverload {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	int add(int ...a) {
		int sum = 0;
		for (int t : a) {
			sum += t;
		}
		return sum;
	}
}

public class FunctionOverload {
	public static void main(String[] args) {
		Funcoverload fo = new Funcoverload();
		int res = fo.add(1, 2);
		System.out.println(res);
		int res1 = fo.add(1, 2, 3);
		System.out.println(res1);
		int res2 = fo.add(2, 3, 2, 3, 1);
		System.out.println(res2);
	}
}
