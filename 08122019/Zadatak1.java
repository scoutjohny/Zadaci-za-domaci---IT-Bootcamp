package chnpo;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji sumira sve brojeve od 1
		 *  do unetog broja N
		 * */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n:");
		int n=sc.nextInt();
		int br=1;
		int sum=0;
		while(br<n) {
			sum+=br;
			br+=1;
		}
		System.out.println(sum);
	}

}
