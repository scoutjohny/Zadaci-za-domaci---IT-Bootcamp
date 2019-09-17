package pp;

import java.util.Scanner;

public class Obim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r, p, o;
		System.out.print("Ucitaj R: ");
		r = sc.nextDouble();
		o = 2 * r * 3.14;
		p = r * r * 3.14;
		System.out.println("Obim je: " + o);
		System.out.println("Povrsina je: " + p);
	}

}
