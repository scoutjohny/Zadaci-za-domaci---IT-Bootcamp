package dp;

import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi a: ");
		double a = sc.nextDouble();
		// System.out.println("Uneli ste stranicu "+a);

		System.out.println("Unesi b: ");
		double b = sc.nextDouble();
		// System.out.println("Uneli ste stranicu "+a);

		if (a > 0 && b > 0) {
			System.out.println("Obim je " + (2 * (a + b)));
		} else if(a>0){
			System.out.println("Los unos stranice B!");
		}else if(b>0) {
			System.out.println("Los unos stranice A!");
		}else {
			System.out.println("Lose unete obe stranice!");
		}
		System.out.println("Kraj programa!");

		/*
		 * if(a>0) { if(b>0) {
		 * 
		 * }else {
		 * 
		 * } }else { if(a<-2) {
		 * 
		 * } }
		 */
		/*
		 * if (a > 0) System.out.println("Poruka vezana uz IF"); else
		 * System.out.println("Poruka vezana uz ELSE");
		 * System.out.println("Poruka nije vezana");
		 */
	}

}
