package dp;

import java.util.Scanner;

public class BDuM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi ime meseca:");
		String a;
		a = sc.nextLine();
		/*
		 * switch (a) { case "Januar": System.out.println("31"); break; case "Februar":
		 * System.out.println("28"); break; case "Mart": System.out.println("31");
		 * break; case "April": System.out.println("30"); break; case "Maj":
		 * System.out.println("31"); break; case "Jun": System.out.println("30"); break;
		 * case "Jul": System.out.println("31"); break; case "Avgust":
		 * System.out.println("31"); break; case "Septembar": System.out.println("30");
		 * break; case "Oktobar": System.out.println("31"); break; case "Novembar":
		 * System.out.println("30"); break; case "Decembar": System.out.println(31);
		 * break; default: System.out.println("Greska"); }
		 */

		switch (a) {
		case "Januar":
		case "Mart":
		case "Maj":
		case "Jul":
		case "Avgust":
		case "Oktobar":
		case "Decembar":
			System.out.println(31);
			break;
		case "Februar":
			System.out.println(28);
			break;
		case "April":
		case "Jun":
		case "Novembar":
		case "Septembar":
			System.out.println(30);
			break;
		default:
			System.out.println("Los Unos!");break;
		}
	}

}
