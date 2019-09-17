package vezbanje;

import java.util.Scanner;

public class FjeVezbanje {

	public static void main(String[] args) {
		// Napisati metodu (funkciju) koja ce
		// vratiti poziciju najveceg elementa u nizu
		// a zatim ispisati taj element
		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitaj n:");
		int n = sc.nextInt();
		int[] nizzko = new int[n];
		ucitajNiz(nizzko);
		int max=vratiPozMax(nizzko);
		System.out.println("Najveci element je "+nizzko[max]+" na poziciji "+max);
	}	

	public static void ucitajNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite " + niz.length + " elemenata: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static int vratiPozMax(int[] niz) {
		int max=0;
		for(int i=1;i<niz.length;i++) {
			if(niz[i]>niz[max]) {
				max=i;
			}
		}
		return max;
	}
}
