package proj;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 5, 4, 1, 3, 6 };
		int length = a.length;
		int value = 0;
		int temp = 0;
		for (int i = 0; i < length - 1; i++) {
			value = i;
			for (int j = i + 1; j < length; j++) {
				if (a[value] > a[j]) {
					value = j;
				}
			}
			temp = a[i];
			a[i] = a[value];
			a[value] = temp;
		}

		for (int a1 : a) {
			System.out.print(a1);
		}
	}

}
