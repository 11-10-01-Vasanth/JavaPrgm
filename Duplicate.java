package proj;

public class Duplicate {

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 6, 6, 7, 5, 3, 6, 6, 3, 4, 6, 3, 4, 6, 3, 4 };
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(a[i]);
			}
		}
	}
}
