package proj;

public class Array {

	public static void main(String[] args) {

		// One Dimensional
		// int a[] = new int[5];
		int x[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println();

		/*
		 * forEach syntax
		 * 
		 * for(data_type temp_var : Array_var) { System.out.println(temp_var); }
		 * 
		 */

		for (int t : x) {
			System.out.print(t);
		}

		// Two dimensional

		// int b[][] = {{1,2,3},{1,2},{1,2,3,4}};
		System.out.println();

		int b[][] = new int[3][5];
		System.out.println("Row length  : " + b.length);
		System.out.println("Column length  : " + b[0].length);

		int c[][] = { { 1, 2, 3 }, { 1, 2 }, { 1, 2, 3, 4 } };
		for (int i[] : c) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("\n Three dimensional ");

		// Three dimensional
		int d[][][] = { { { 1, 2 }, { 2, 1 } }, { { 1, 2 }, { 2, 1 } } };
		for (int q[][] : d) {
			for (int a[] : q) {
				for (int l : a) {
					System.out.print(l+" ");
				}
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
