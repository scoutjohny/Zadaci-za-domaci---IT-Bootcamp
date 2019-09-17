package cnutorak;

import java.util.Scanner;

public class SumCIf {
	public static void main(String[] args) {

		/*
		 * Napisati program koji racuna sumu cifara unetog broja
		 * 
		 * Napisati program koji proverava da li je uneti
		 * broj palindrom
		 * */
		Scanner sc= new Scanner(System.in);
		System.out.println("N?");
		int n=sc.nextInt(),sum=0;
		while(n!=0) {
			int c=n%10;
			sum+=c;
			n/=10;
		}
		System.out.println("Suma je "+sum);
	}
}
