package pnu;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		int opcija, racun = 0, kupovina = 0;

		do {
			System.out.println("***KASA***");
			System.out.println("Trenutna cena odabranih proizvoda iznosi: " + racun + " din.");
			System.out.println("Odaberite operaciju:");
			System.out.println("  1) Kupovina novog proizvoda");
			System.out.println("  2) Naplata racuna");
			System.out.println("  0) Zatvaranje kase");
			opcija = ulaz.nextInt();

			switch (opcija) {
			case 1:
				System.out.println("Unesite cenu novog proizvoda:");
				kupovina = ulaz.nextInt();
				while (kupovina <= 0) {
					System.out.println(
							"Nemamo besplatnih proizvoda, niti Vam placamo da uzmete neke od nasih proizvoda.");
					System.out.println("Unesite cenu proizvoda:");
					kupovina = ulaz.nextInt();
				}
				racun += kupovina;
				break;
			case 2:
				System.out.println("Vas racun iznosi " + racun + " din. Molimo unesite koliko novca stavljate u kasu:");
				int naplata = ulaz.nextInt();
				
				while (naplata < racun) {
					System.out.println("Vas iznos ne pokriva troskove racuna: " + racun
							+ " din. Molimo Vas ponovo unesite koliko novca dajete stavljate u kasu:");
					naplata = ulaz.nextInt();
				}
				System.out.println("Hvala. Vas kusur iznosi " + (naplata - racun) + " din. Dodjite nam opet! \n");
				racun = 0;
				break;
			case 0:
				if (racun > 0) {
					System.out.println("Vas racun nije naplacen.");
					System.out.println("Ukoliko i dalje zelite da izadjete iz programa, potvrdite unosom nule.");
					System.out.println("Ukoliko zelite da nastavite s koriscenjem programa, unesite bilo koji broj.");
					opcija = ulaz.nextInt();
					if (opcija != 0) {
						break;
					}
				}
				System.out.println("Kasa se gasi. Izlazak iz programa.");
				break;
			default:
				System.out.println("Pogresan unos. Molimo Vas odaberite jednu od ponudjenih operacija.");
				break;
			}
		} while (opcija != 0);

	}
}
