package neebalgurukulday3;

import java.util.Scanner;

public class Soln3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 8; 
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			} 
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}
