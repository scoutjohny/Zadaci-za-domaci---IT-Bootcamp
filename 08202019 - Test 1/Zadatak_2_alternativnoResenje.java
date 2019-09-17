package Test_08202019;

import java.util.Scanner;

public class Zadatak_2_alternativnoResenje {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi brojeve K, N, M. Program ispisuje brojeve od K do
		 * N ukljucujuci i N koji nisu deljivi brojem M. Proveriti da li je K manje od
		 * N. Ukoliko nije zameniti K i N tako da prethodni uslov bude tacan.
		 * 
		 * Ovo je elegantnije resenje zadatka, kraci je kod i izgleda bolje!
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unestie jedan ceo broj: ");
		int k = sc.nextInt();
		System.out.println("Unestie drugi ceo broj: ");
		int n = sc.nextInt();
		System.out.println("Unestie treci ceo broj: ");
		int m = sc.nextInt();
		if (k > n) {
			int temp = k;
			k = n;
			n = temp;
		}
		for (int i = k; i < n; i++) {
			if (i % m != 0) {
				System.out.println(i);
			}
		}

	}

}
