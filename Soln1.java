package neebalgurukulday3;

import java.util.Scanner;

public class Soln1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
