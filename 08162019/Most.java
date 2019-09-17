package cnp;

import java.util.Scanner;

public class Most {

	public static void main(String[] args) {
		// Korsinik unosi broj automobila -N koji se nalaze
		// na mostu
		// Zatim korisnik unosi nosivost mosta
		// Potom korisnik unosi tezine N automobila
		// Ukoliko unese ne[to pogreseno
		// Prekida se unos i izvrsava se provera
		// da limost moze da podnese tezinu koja do tada
		// uneta
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		System.out.println("Nosivost?");
		int nosivost = sc.nextInt(), sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Unesi tezinu " + (i + 1));
			int unos = sc.nextInt();
			if (unos <= 0) {
				System.out.println("Los unos! Prekid!");
				break;
			}
			sum += unos;
		}
		if (sum <= nosivost)
			System.out.println("OK!");
		else
			System.out.println("Prekoracenje!");
	}

}
