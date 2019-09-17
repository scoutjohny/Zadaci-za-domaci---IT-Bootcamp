package cnp;

import java.util.Scanner;

public class Preskakanje {

	public static void main(String[] args) {
		// Napisati program koji od korisnika unosi N
		// Zatim program unosi N brojeva
		// i dodaje ih na sumu
		// Ukoliko korisnik unese 0 za neki od brojeva
		// Prekinuti unos i ispisati sumu
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneis n?");
		int n = sc.nextInt();
		int sum, i;
		for (i = 0, sum = 0; i < n; i++) {
			System.out.println("Unesi broj: ");
			int unos = sc.nextInt();
			if (unos == 0)
				break;
			sum+=unos;
		}
		System.out.println("Suma je "+sum);

	}

}
