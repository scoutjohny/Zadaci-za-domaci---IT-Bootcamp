package cnc;

import java.util.Scanner;

public class PinkoveZvezdice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*String s = "";
		for (int i = 1; i <= n; i++) {
			s+="*";
			System.out.println(s);
		}*/

	}

}
