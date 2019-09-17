package cnp;

import java.util.Scanner;

public class CetZad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("To "+1.0/0.0+" and beyond");
		System.out.println("N?");
		int n = sc.nextInt();
		double sum = 0, g = 0, d = 1;
		for (int i = 1; i <= n; i++) {
			g += i;
			d *= i;
			sum += g / d;
		}
		System.out.println(sum);

	}

}
