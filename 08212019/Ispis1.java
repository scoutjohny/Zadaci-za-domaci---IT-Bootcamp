package pns;

import java.util.Scanner;

public class Ispis1 {

	public static void main(String[] args) {
		// napisati program koji ucitava duzinu niza,
		//  niz i brojeve K i M
		// 
		// i ispisuje
		// SVE ELEMENTE NIZA koji su veci od
		// broja K a manji od unetog broja M
		Scanner unos= new Scanner(System.in);
		System.out.print("Unesi duzinu niza: ");
		int n=unos.nextInt();
		int[] zivko=new int[n];
		System.out.print("Unesi K i M: ");
		int k,m;
		k=unos.nextInt();
		m=unos.nextInt();
		System.out.print("Unesi "+n+" elemenata niza: ");
		for(int i=0;i<zivko.length;i++) {
			zivko[i]=unos.nextInt();
		}
		System.out.println("Uspesno uneseni elementi.");
		for(int j=0;j<zivko.length;j++) {
			if(zivko[j]>k && zivko[j]<m) {
				System.out.println("Element je "+ zivko[j]);
			}
		}
	}

}
