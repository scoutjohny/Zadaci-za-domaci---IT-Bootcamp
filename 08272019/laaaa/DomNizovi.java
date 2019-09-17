package laaaa;

import java.util.Scanner;

public class DomNizovi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitaj(niz);
		System.out.println("Proiz: "+proizvod(niz));
		System.out.println("Suma: "+zbir(niz));

	}

	public static void ucitaj(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucitaj elemente niza");
		for (int br = 0; br < niz.length; br++) {
			niz[br] = sc.nextInt();
		}

	}

	public static int proizvod(int[] niz) {
		int pr = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 != 0)
				pr *= niz[i];
		}
		return pr;
	}
	public static int zbir(int[] niz) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0)
				sum+=niz[i];
		}
		return sum;
	}

}
