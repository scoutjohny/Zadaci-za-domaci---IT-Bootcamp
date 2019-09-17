package chnpo;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispisuje parne brojeve od 0 do N, ukljucujuci i N.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n i k:");
		//System.out.printf();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int br = k;
		while (br <= n) {
			if (br % 2 == 0) {
				System.out.println(br);
			}
			br += 1;
		}

	}

}
