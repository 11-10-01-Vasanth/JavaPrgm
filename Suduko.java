package proj;

import java.util.*;

public class Suduko {
	public static void main(String[] args) {
		int a[][] = new int[10][10];
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		int column = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
//				System.out.print(a[i][j]);
				if (a[i][j] != 0) {
					System.out.print(a[i][j]);
				} else {
					int num;
					if(a[i][j] == 0) {
						num = a[i][j] + 1;
					}
					else {
						num = a[i][j] + j;
					}
					System.out.print(num);
				}
			}
			System.out.println();
		}
	}
}
