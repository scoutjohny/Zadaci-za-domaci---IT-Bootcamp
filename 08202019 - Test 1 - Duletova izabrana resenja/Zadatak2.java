package pnu;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int k, n, m;
		
		System.out.println("Program ispisuje brojeve od K do N, ukljucujuci i N-ove koji nisu deljivi brojem M.");
		System.out.println("Unesite K, N i M:");
		k = ulaz.nextInt();
		n = ulaz.nextInt();
		m = ulaz.nextInt();
		
		if(k>n) {
			int temp = k;
			k = n;
			n = temp;
			System.out.println("K i N su zamenili vrednosti jer je K mora biti manji od N.");
		}
		
		for(int i=k; i<=n; i++) {
			if(i%m == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
