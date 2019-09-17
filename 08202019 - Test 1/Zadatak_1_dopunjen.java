package Test_08202019;

import java.util.Scanner;

public class Zadatak_1_dopunjen {

	public static void main(String[] args) {
/*Napisati program na programskom jeziku Java koji ima sledece 
 * funkcionalnosti za potrebe ugostiteljskog objekta:

Program sadrzi meni koji ima sledece opcije:
0 - Izlaz
1 - Dodavanje cene na racun
2 - Naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu 
proizvoda i ta cena se dodaje na racun korisnika.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu 
novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da 
se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje 
se kusur i racun se stornira to jest postavlja na nulu. Zatim se ponovo 
ispisuje meni.
 
 OVO JE DORADJENA VERZIJA PROGRAMA!!!!!
 */
		Scanner sc=new Scanner (System.in);
		double rac=0, kus=0;
		int n;
		do {
			System.out.println("Dobrodosli!");
			System.out.println("Molimo Vas da izaberete jednu od ponudjenih opcija:");
			System.out.println("0 - Izlaz iz programa");
			System.out.println("1 - Dodavanje cene na racun");
			System.out.println("2 - Naplata racuna");
			n=sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("Molimo Vas da unesete cenu proizvoda (u din): ");
				double m=sc.nextDouble();
				rac+=m;
				break;
			case 2:
				System.out.println("Vas racun iznosi "+rac);
				System.out.print("Molimo Vas da unesete raspolozivu kolicinu novca: ");
				double k=sc.nextDouble();
				if (k<rac) {
					System.out.println("Nedovoljno novca! Vaz racun iznosi "+rac+"din a uneta svota ("+k+" din) je manja od njega!");
					System.out.println();
					break;
				}else {
					kus=k-rac;
					System.out.println("Vas kusur je: "+kus+" din");
					System.out.println();
					rac=0;
					break;
				}
			default:
				System.out.println("Pogresan odabir! Procitajte pazljivo stavke menija");
				break;
			case 0:
				if (rac!=0) {
					System.out.println("Racun nije prazan, odaberite neku drugu opciju!");
					System.out.println();
					n=1;
					continue;
				}else {
				System.out.println("Izlaz iz programa!");
				break;	
				}
				
			}
			}while(n!=0);
		

	}

}
