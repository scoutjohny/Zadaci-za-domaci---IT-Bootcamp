package dp;

import java.util.Scanner;

public class Meseci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi broj meseca u godini :D:");
		int br=sc.nextInt();

		if(br==1) {
			System.out.println("Januar");
		}else if(br==2) {
			System.out.println("Februar");
		}else if(br==3) {
			System.out.println("Mart");
		}else if(br==4) {
			System.out.println("April");
		}else if(br==5) {
			System.out.println("Maj");
		}else if(br==6) {
			System.out.println("Jun");
		}else if(br==7) {
			System.out.println("Jul");
		}else if(br==8) {
			System.out.println("Avgust");
		}else if(br==9) {
			System.out.println("Septembar");
		}else if(br==10) {
			System.out.println("Oktobar");
		}else if(br==11) {
			System.out.println("Novembar");
		}else if(br==12) {
			System.out.println("Decembar");
		}else{
			System.out.println("Los Unos!");
		}
		//ovde
	}

}
