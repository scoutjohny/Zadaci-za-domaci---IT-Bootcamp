package vezbanje;

import java.util.Scanner;

public class SOrtiranje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitaj n:");
		int n = sc.nextInt();
		int[] nizzko = new int[n];
		ucitajNiz(nizzko);
		ispisiNiz(nizzko);
		sortirajOpadajuce(nizzko);
		ispisiNiz(nizzko);
		sortirajRastuce(nizzko);
		ispisiNiz(nizzko);

	}
	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite " + niz.length + " elemenata: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}
	public static void ispisiNiz(int[] niz) {
		for(int i=0;i<niz.length;i++) {
			System.out.print(niz[i]+" ");
		}
		System.out.println();
	}
	public static void sortirajRastuce(int[] niz) {
		for(int i=0;i<niz.length-1;i++) {
			for(int j=i+1;j<niz.length;j++) {
				if(niz[i]>niz[j]) {
					int pom=niz[j];
					niz[j]=niz[i];
					niz[i]=pom;
				}
			}
		}
	}
	public static void sortirajOpadajuce(int[] niz) {
		for(int i=0;i<niz.length-1;i++) {
			for(int j=i+1;j<niz.length;j++) {
				if(niz[i]<niz[j]) {
					int pom=niz[j];
					niz[j]=niz[i];
					niz[i]=pom;
				}
			}
		}
	}

}
