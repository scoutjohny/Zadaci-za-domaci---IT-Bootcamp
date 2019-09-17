package dp;

import java.util.Scanner;

public class Grananje {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi r: ");
		double r=sc.nextDouble();
		if(r>0) {
			System.out.println("Obim je: "+(2*r*3.14));
		}
		System.out.println("Kraj programa!");
		/*if(r>1 && r%2==0)*/
	}

}
