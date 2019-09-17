package vezbanje;

import java.util.Scanner;

public class Vezbanje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitaj n:");
		int n = sc.nextInt();
		int[] nizzko=new int[n];
		ucitajNiz(nizzko);
		System.out.println();
		ispisiNiz(nizzko);

	}
	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite "+niz.length+" elemenata: ");
		for(int i=0;i<niz.length;i++) {
			niz[i]=sc.nextInt();
		}
	}
	public static void ispisiNiz(int[] niz) {
		for(int i=0;i<niz.length;i++) {
			System.out.print(niz[i]+" ");
		}
		System.out.println();
	}

}
